package com.currency.crypto.ui.pages.technical_analysis

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.currency.crypto.core.library.soundClickListener
import com.currency.crypto.databinding.FragmentConceptBinding
import com.currency.crypto.ui.other.ViewBindingFragment

class FragmentConcept: ViewBindingFragment<FragmentConceptBinding>(FragmentConceptBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBack.soundClickListener {
            findNavController().popBackStack()
        }
    }
}