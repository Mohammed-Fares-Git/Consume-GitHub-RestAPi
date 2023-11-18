package com.example.myapplication.domain.repository

import com.example.myapplication.domain.model.GithubUser

interface LocalRepository {
    suspend fun insert(user: GithubUser): Long
    suspend fun delete(user: GithubUser): Long
    fun getAll(): List<GithubUser>
}