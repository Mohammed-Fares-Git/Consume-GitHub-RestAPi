package com.example.myapplication.domain.use_case

import com.example.myapplication.comon.Resource
import com.example.myapplication.domain.model.GithubUser
import com.example.myapplication.domain.repository.LocalRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class deleteUserLocalyUseCase @Inject constructor(
    val localeRepository: LocalRepository
){
    operator fun invoke(user: GithubUser): Flow<Resource<List<GithubUser>>> = flow {
        try {
            val users = localeRepository.getAll()
            emit(Resource.Success(users))

        } catch (e: Exception) {
            emit(Resource.Error("an error occures 2"))
        }
    }
}