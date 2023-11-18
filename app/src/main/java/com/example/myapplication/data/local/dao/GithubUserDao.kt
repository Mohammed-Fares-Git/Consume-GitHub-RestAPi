package com.example.myapplication.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.comon.Constantes
import com.example.myapplication.domain.model.GithubUser

@Dao
interface GithubUserDao {

    @Insert
    suspend fun insertUser(user: GithubUser): Long

    @Delete
    suspend fun deleteUser(user: GithubUser): Long

    @Query("SELECT * FROM ${Constantes.GITHUB_USERS_TABLE}")
    fun getAllUsers():List<GithubUser>
}