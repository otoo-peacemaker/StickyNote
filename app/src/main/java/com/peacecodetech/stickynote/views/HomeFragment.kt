package com.peacecodetech.stickynote

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.peacecodetech.stickynote.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {



    private lateinit var viewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        // TODO: Use the ViewModel

        binding.addId.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_addNoteFragment)
        }

    }

    companion object {
        fun newInstance() = HomeFragment()
    }

}