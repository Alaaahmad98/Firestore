package com.example.firestore.presentation.di

import com.example.firestore.data.repository.dataSourceImpl.UserRemoteDataSourceImpl
import com.google.firebase.firestore.CollectionReference
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataSourceModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(reference: CollectionReference) =
        UserRemoteDataSourceImpl(reference)
}