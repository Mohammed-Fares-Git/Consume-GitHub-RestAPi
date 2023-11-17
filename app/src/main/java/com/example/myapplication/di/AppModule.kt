package com.example.myapplication.di

import android.content.Context
import androidx.room.Room
import com.example.myapplication.comon.Constantes
import com.example.myapplication.data.local.LocalUsers
import com.example.myapplication.data.remote.GithubApiService
import com.example.myapplication.data.repository.LocaleRepositoryIMPL
import com.example.myapplication.data.repository.RemoteRepositoryIMPL
import com.example.myapplication.domain.repository.LocalRepository
import com.example.myapplication.domain.repository.RemoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext ctx: Context): LocalUsers {
        return Room.databaseBuilder(
            ctx.applicationContext,
            LocalUsers::class.java,
            Constantes.DB_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun provideRemoteRepo(api: GithubApiService): RemoteRepository {
        return RemoteRepositoryIMPL(api)
    }
    @Singleton
    @Provides
    fun providelocalRepo(db: LocalUsers): LocalRepository {
        return LocaleRepositoryIMPL(db)
    }
}