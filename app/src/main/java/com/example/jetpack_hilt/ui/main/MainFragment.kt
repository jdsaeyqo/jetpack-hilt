package com.example.jetpack_hilt.ui.main


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jetpack_hilt.R
import com.example.jetpack_hilt.ui.second.SecondActivity
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_activity.setOnClickListener {
            val intent = Intent(requireContext(),SecondActivity::class.java)
            startActivity(intent)

        }
        btn_fragment.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
        }
    }


}
