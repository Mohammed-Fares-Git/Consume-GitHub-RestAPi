package com.example.myapplication.domain.repository

import com.example.myapplication.data.remote.dto.GithubUserDto

interface RemoteRepository {
    suspend fun getAllUsers(): List<GithubUserDto>
}