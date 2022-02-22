package com.example.firestore.presentation.di

import android.app.Application
import com.example.firestore.domain.usecase.AddUserUseCase
import com.example.firestore.presentation.user.UserViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    @Singleton
    @Provides
    fun provideViewModelFactory(
        application: Application,
        addUserUseCase: AddUserUseCase
    ) = UserViewModelFactory(application, addUserUseCase)
}