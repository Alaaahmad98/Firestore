package com.example.firestore.presentation.user

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.firestore.domain.usecase.AddUserUseCase

class UserViewModelFactory(
    private val app: Application,
    private val addUserUseCase: AddUserUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(UserViewModel::class.java) -> UserViewModel(
                app,
                addUserUseCase
            ) as T
            else -> throw  IllegalArgumentException("ViewModelClass Not Found")
        }
    }
}