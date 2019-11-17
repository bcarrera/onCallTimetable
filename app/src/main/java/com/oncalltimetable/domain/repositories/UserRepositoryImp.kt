package com.oncalltimetable.domain.repositories

import com.oncalltimetable.data.db.daos.UserDao
import com.oncalltimetable.data.db.entities.UserEntity
import com.oncalltimetable.data.repositories.UserRepository

class UserRepositoryImp(private val userDao: UserDao): UserRepository {
    override fun getAllUsers() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun insertUser(user: UserEntity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delleteAllUsers() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}