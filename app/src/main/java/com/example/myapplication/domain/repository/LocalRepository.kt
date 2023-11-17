package com.example.myapplication.domain.repository

import com.example.myapplication.domain.model.GithubUser

interface LocalRepository {
    suspend fun insert(user: GithubUser): Boolean
    suspend fun delete(user: GithubUser): Boolean
    fun getAll(): List<GithubUser>
}