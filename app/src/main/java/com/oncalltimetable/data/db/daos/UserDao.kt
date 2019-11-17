package com.oncalltimetable.data.db.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.oncalltimetable.data.db.entities.UserEntity

@Dao
interface UserDao {

    @Query("SELECT * from user_table ORDER BY first_surname ASC")
    fun getUsers(): LiveData<List<UserEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(user: UserEntity)

    @Query("DELETE FROM user_table")
    suspend fun deleteAll()
}