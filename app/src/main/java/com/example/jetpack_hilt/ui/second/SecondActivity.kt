package com.example.jetpack_hilt.ui.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jetpack_hilt.R
import com.example.jetpack_hilt.data.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var repository: MyRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}