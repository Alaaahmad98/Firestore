package com.example.firestore.domain.repository

import com.example.firestore.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface UserRepository {

    suspend fun addUser(username: String, userProfile: String): Flow<Any>

}