package com.example.firestore.domain.usecase

import com.example.firestore.domain.repository.UserRepository

class AddUserUseCase(private val userRepository: UserRepository) {

    suspend fun execute(username: String, userProfile: String) {
        userRepository.addUser(username, userProfile)
    }
}