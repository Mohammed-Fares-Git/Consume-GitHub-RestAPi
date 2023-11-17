package com.example.myapplication.domain.use_case

import com.example.myapplication.comon.Resource
import com.example.myapplication.domain.model.GithubUser
import com.example.myapplication.domain.repository.LocalRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class getUsersLocalyUseCase @Inject constructor(
    val localeRepository: LocalRepository
){
    operator fun invoke(user: GithubUser): Flow<Resource<Boolean>> = flow {
        try {
            val delete = localeRepository.delete(user)
            if (delete) {
                emit(Resource.Success(delete,"deleted seccessfuly"))
            } else {
                emit(Resource.Error("an error occures"))
            }
        } catch (e: Exception) {
            emit(Resource.Error("an error occures 2"))
        }
    }
}