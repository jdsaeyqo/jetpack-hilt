package com.example.jetpack_hilt.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.jetpack_hilt.R
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment(R.layout.fragment_second) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_pre.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_mainFragment)
        }
    }


}