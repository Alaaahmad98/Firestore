package com.example.firestore.presentation.user

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.firestore.domain.usecase.AddUserUseCase

class UserViewModelFactory(
    private val addUserUseCase: AddUserUseCase
    ) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when{

        }
    }
}