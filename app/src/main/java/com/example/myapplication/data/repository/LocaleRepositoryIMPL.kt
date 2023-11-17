package com.example.myapplication.data.repository

import com.example.myapplication.data.local.LocalUsers
import com.example.myapplication.domain.model.GithubUser
import com.example.myapplication.domain.repository.LocalRepository
import javax.inject.Inject

class LocaleRepositoryIMPL @Inject constructor(
    val db: LocalUsers
): LocalRepository {
    override suspend fun insert(user: GithubUser): Boolean {
        return db.loacalUserDao().insertUser(user)
    }

    override suspend fun delete(user: GithubUser): Boolean {
        return db.loacalUserDao().deleteUser(user)
    }

    override fun getAll(): List<GithubUser> {
        return db.loacalUserDao().getAllUsers()
    }
}