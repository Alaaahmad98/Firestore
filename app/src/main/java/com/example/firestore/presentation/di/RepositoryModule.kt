package com.example.firestore.presentation.di

import com.example.firestore.data.repository.UserRepositoryImpl
import com.example.firestore.data.repository.dataSourceImpl.UserRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideUserRepository(userRemoteDataSourceImpl: UserRemoteDataSourceImpl) =
        UserRepositoryImpl(userRemoteDataSourceImpl)

}