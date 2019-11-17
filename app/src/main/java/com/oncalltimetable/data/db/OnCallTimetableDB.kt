package com.oncalltimetable.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.oncalltimetable.data.db.daos.UserDao
import com.oncalltimetable.data.db.entities.UserEntity

@Database(entities = [UserEntity::class], version = 1, exportSchema = false)
public abstract class OnCallTimetableDB : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: OnCallTimetableDB? = null

        fun getDatabase(context: Context): OnCallTimetableDB {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    OnCallTimetableDB::class.java,
                    "oncalltimetable_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}