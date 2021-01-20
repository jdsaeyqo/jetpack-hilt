package com.example.jetpack_hilt.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.jetpack_hilt.data.MyRepository

class MainViewModel @ViewModelInject constructor(
    private val repository: MyRepository
): ViewModel() {

    fun getRepositoryHash() = repository.hashCode().toString()
}