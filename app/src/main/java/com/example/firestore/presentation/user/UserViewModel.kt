package com.example.firestore.presentation.user

import android.app.Application
import androidx.lifecycle.*
import com.example.firestore.domain.usecase.AddUserUseCase

class UserViewModel(
    private val app: Application,
    private val addUserUseCase: AddUserUseCase
) : AndroidViewModel(app) {

    fun addUser(username: String, userProfile: String) = liveData {
        val result = addUserUseCase.execute(username, userProfile)
        emit(result)
    }
}