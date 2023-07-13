package com.currency.crypto.ui.main

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.currency.crypto.R
import com.currency.crypto.core.library.soundClickListener
import com.currency.crypto.databinding.FragmentMainBinding
import com.currency.crypto.ui.other.ViewBindingFragment

class FragmentMain: ViewBindingFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            buttonStart.soundClickListener {
                findNavController().navigate(R.id.action_fragmentMain_to_fragmentSelection)
            }
        }
    }
}