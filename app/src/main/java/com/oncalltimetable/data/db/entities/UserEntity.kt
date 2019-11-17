package com.oncalltimetable.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class UserEntity(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "first_surname") val firstSurname: String?,
    @ColumnInfo(name = "second_surname") val secondSurname: String?,
    @ColumnInfo(name = "type") val type: String?,
    @ColumnInfo(name = "phone") val phone: String?
)