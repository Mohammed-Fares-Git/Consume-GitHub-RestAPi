package com.example.myapplication.domain.use_case

import com.example.myapplication.comon.Resource
import com.example.myapplication.data.remote.dto.toGithubUser
import com.example.myapplication.domain.model.GithubUser
import com.example.myapplication.domain.repository.RemoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    val repository: RemoteRepository
) {
    operator fun invoke(): Flow<Resource<List<GithubUser>>> = flow {
        try {
            emit(Resource.Loading())
            val users: List<GithubUser> = repository.getAllUsers().map { it.toGithubUser() }
            emit(Resource.Success(users))
        } catch (e: HttpException) {
            emit(Resource.Error("http Exeption"))
        } catch (e: IOException) {
            emit(Resource.Error("IO Exeption"))
        }
    }
}