package com.example.userprofile.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

import com.example.userprofile.model.User

class ProfileViewModel() : ViewModel() {
    val currentUser: MutableState<User?> = mutableStateOf<User?>(null)

    init {
        loadUser()
    }

    private fun loadUser() {
        currentUser.value = User(
            name = "Анна Петрова",
            age = 28,
            avatarUrl = "https://example.com/avatar.jpg"
        )
    }
}