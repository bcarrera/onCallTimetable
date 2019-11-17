package com.oncalltimetable.data.repositories

import com.oncalltimetable.data.db.entities.UserEntity

interface UserRepository {
    fun getAllUsers()
    fun insertUser(user: UserEntity)
    fun delleteAllUsers()
}