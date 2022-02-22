package com.example.firestore.presentation.user

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firestore.domain.usecase.AddUserUseCase
import kotlinx.coroutines.launch

class UserViewModel(
    private val addUserUseCase: AddUserUseCase
) : ViewModel() {

    fun addUser(username: String, userProfile: String) {
        viewModelScope.launch {
            addUserUseCase.execute(username, userProfile)
        }
    }
}