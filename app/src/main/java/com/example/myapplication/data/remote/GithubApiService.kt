package com.example.myapplication.data.remote

import com.example.myapplication.comon.Constantes
import com.example.myapplication.data.remote.dto.GithubUserDto
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path

interface GithubApiService {

    @GET(Constantes.USERS_API_ENDPOINT)
    suspend fun getAll():List<GithubUserDto>

    //@GET(Constantes.USER_BY_ID_API_ENDPOINT)
    //fun getUserById (@Path(Constantes.ID_SEARSH_PARAM) userId: String)
}