package com.example.myapplication.data.local

import androidx.room.Database
import com.example.myapplication.comon.Constantes
import com.example.myapplication.data.local.dao.GithubUserDao
import com.example.myapplication.domain.model.GithubUser

@Database(entities = [GithubUser::class], version = Constantes.DB_VERSION)
abstract class LocalUsers {
    abstract fun loacalUserDao(): GithubUserDao
}