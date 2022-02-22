package com.example.firestore.data.repository.dataSourceImpl

import com.example.firestore.data.model.User
import com.example.firestore.data.repository.dataSource.UserRemoteDataSource
import com.example.firestore.data.util.Resource
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.Query
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserRemoteDataSourceImpl(
    private val usersRef: CollectionReference,
) : UserRemoteDataSource {

    override suspend fun addUser(username: String, userProfile: String)=flow{
        try {
            val userId = usersRef.document().id
            val user = User(
                username = "alaa",
                userPicture = null
            )
            val addition = usersRef.document(userId).set(user)
            emit(addition)
        } catch (e: Exception) {
            emit(Error(e.message ?: e.toString()))
        }
    }


}