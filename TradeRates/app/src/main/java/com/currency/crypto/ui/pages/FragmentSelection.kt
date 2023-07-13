package com.currency.crypto.ui.pages

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.currency.crypto.R
import com.currency.crypto.core.library.soundClickListener
import com.currency.crypto.databinding.FragmentSelectionBinding
import com.currency.crypto.ui.other.ViewBindingFragment

class FragmentSelection :
    ViewBindingFragment<FragmentSelectionBinding>(FragmentSelectionBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBack.soundClickListener {
            findNavController().popBackStack()
        }
        binding.introductionLayout.soundClickListener {
            findNavController().navigate(R.id.action_fragmentSelection_to_fragmentIntroduction)
        }
        binding.layoutTechnicalAnalysis.soundClickListener {
            findNavController().navigate(R.id.action_fragmentSelection_to_fragmentTechnicalAnalysis)
        }
        binding.layoutCryptocurrencies.soundClickListener {
            findNavController().navigate(R.id.action_fragmentSelection_to_fragmentCrypto)
        }
    }
}