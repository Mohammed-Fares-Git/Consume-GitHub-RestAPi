package com.example.myapplication.data.repository

import com.example.myapplication.data.remote.GithubApiService
import com.example.myapplication.data.remote.dto.GithubUserDto
import com.example.myapplication.domain.repository.RemoteRepository
import javax.inject.Inject

class RemoteRepositoryIMPL @Inject constructor(
    val api: GithubApiService
)  : RemoteRepository {
    override suspend fun getAllUsers(): List<GithubUserDto> {
        return api.getAll()
    }
}