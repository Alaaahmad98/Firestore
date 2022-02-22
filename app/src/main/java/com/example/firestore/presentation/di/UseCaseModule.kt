package com.example.firestore.presentation.di

import com.example.firestore.domain.repository.UserRepository
import com.example.firestore.domain.usecase.AddUserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun provideAddUserUseCase(userRepository: UserRepository)= AddUserUseCase(userRepository)
}