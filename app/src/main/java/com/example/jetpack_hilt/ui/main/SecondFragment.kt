package com.example.jetpack_hilt.ui.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.jetpack_hilt.R
import com.example.jetpack_hilt.data.MyRepository
import com.example.jetpack_hilt.di.qualifier.ActivityHash
import com.example.jetpack_hilt.di.qualifier.AppHash
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_second.*
import javax.inject.Inject

@AndroidEntryPoint
class SecondFragment : Fragment(R.layout.fragment_second) {

    @Inject
    lateinit var repository: MyRepository

    @AppHash
    @Inject
    lateinit var appHash : String

    @ActivityHash
    @Inject
    lateinit var activityHash : String


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_pre.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_mainFragment)
        }

        Log.d("SecondFragment","${repository.hashCode()}")
        Log.d("SecondFragment", appHash)
        Log.d("MainFragment",activityHash)
    }


}