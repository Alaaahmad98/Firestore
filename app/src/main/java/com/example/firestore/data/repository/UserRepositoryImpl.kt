package com.example.firestore.data.repository

import com.example.firestore.data.model.User
import com.example.firestore.data.repository.dataSourceImpl.UserRemoteDataSourceImpl
import com.example.firestore.data.util.Resource
import com.example.firestore.domain.repository.UserRepository
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.Query
import kotlinx.coroutines.flow.flow

class UserRepositoryImpl(
    private val userRemoteDataSourceImpl: UserRemoteDataSourceImpl,
) : UserRepository {

    override suspend fun addUser(username: String, userProfile: String) =  userRemoteDataSourceImpl.addUser(username, userProfile)
}