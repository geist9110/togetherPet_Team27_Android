package com.example.togetherpet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.togetherpet.databinding.FragmentInfoRegistrationResidenceBinding


class RegistrationResidenceFragment : Fragment() {
    private var binding : FragmentInfoRegistrationResidenceBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInfoRegistrationResidenceBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            nextButton.setOnClickListener { goToNextScreen() }
        }
    }

    private fun goToNextScreen(){
        findNavController().navigate(R.id.action_registrationResidenceFragment_to_registrationImageFragment)
    }


}