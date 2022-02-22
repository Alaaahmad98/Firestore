package com.example.firestore.data.util

//sealed class Resource<T>(
//    val data: T? = null,
//    val message: String? = null
//) {
//    class Success<T>(data: T) : Resource<T>()
//    class Loading<T>(data: T? = null) : Resource<T>(data)
//    class Error<T>(message: String, data: T?) : Resource<T>(data)
//}

sealed class Resource<out T> {
    object Loading: Resource<Nothing>()

    data class Success<out T>(
        val data: T
    ): Resource<T>()

    data class Error(
        val message: String
    ): Resource<Nothing>()
}