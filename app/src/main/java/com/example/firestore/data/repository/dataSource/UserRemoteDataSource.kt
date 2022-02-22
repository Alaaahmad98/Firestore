package com.example.firestore.data.repository.dataSource

import com.example.firestore.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface UserRemoteDataSource {

    suspend fun addUser(username: String, userProfile: String) : Flow<Any>

}