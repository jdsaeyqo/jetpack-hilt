package com.example.jetpack_hilt.ui.main


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jetpack_hilt.R
import com.example.jetpack_hilt.data.MyRepository
import com.example.jetpack_hilt.di.qualifier.ActivityHash
import com.example.jetpack_hilt.di.qualifier.AppHash
import com.example.jetpack_hilt.ui.second.SecondActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {

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

        btn_activity.setOnClickListener {
            val intent = Intent(requireContext(),SecondActivity::class.java)
            startActivity(intent)

        }
        btn_fragment.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
        }

        Log.d("MainFragment","${repository.hashCode()}")
        Log.d("MainFragment", appHash)
        Log.d("MainFragment",activityHash)

    }


}
