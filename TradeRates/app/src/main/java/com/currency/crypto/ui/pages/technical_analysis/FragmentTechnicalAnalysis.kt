package com.currency.crypto.ui.pages.technical_analysis

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.currency.crypto.R
import com.currency.crypto.core.library.soundClickListener
import com.currency.crypto.databinding.FragmentTechnicalAnalysisBinding
import com.currency.crypto.ui.other.ViewBindingFragment

class FragmentTechnicalAnalysis :
    ViewBindingFragment<FragmentTechnicalAnalysisBinding>(FragmentTechnicalAnalysisBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBack.soundClickListener {
            findNavController().popBackStack()
        }
        binding.fundamentalsLayout.soundClickListener {
            findNavController().navigate(R.id.action_fragmentTechnicalAnalysis_to_fragmentFundamentals)
        }
        binding.simpleIndicatorsLayout.soundClickListener {
            findNavController().navigate(R.id.action_fragmentTechnicalAnalysis_to_fragmentSimpleIndicators)
        }
        binding.conceptOfTrendsLayout.soundClickListener {
            findNavController().navigate(R.id.action_fragmentTechnicalAnalysis_to_fragmentConcept)
        }
    }
}