package com.example.myapplication.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myapplication.comon.Constantes
import org.jetbrains.annotations.NotNull

@Entity(tableName = Constantes.GITHUB_USERS_TABLE)
data class GithubUser(
    @PrimaryKey
    val id: Int,
    val login: String,
    val avatarUrl: String,
    val url: String
)