package com.currency.crypto.ui.pages.intriduction

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.currency.crypto.R
import com.currency.crypto.core.library.soundClickListener
import com.currency.crypto.databinding.FragmentIntroductionBinding
import com.currency.crypto.ui.other.ViewBindingFragment

class FragmentIntroduction :
    ViewBindingFragment<FragmentIntroductionBinding>(FragmentIntroductionBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBack.soundClickListener {
            findNavController().popBackStack()
        }

        binding.introductionBasicsLayout.soundClickListener {
            findNavController().navigate(R.id.action_fragmentIntroduction_to_fragmentIntroductionBasics)
        }
        binding.introductionAdvantagesLayout.soundClickListener {
            findNavController().navigate(R.id.action_fragmentIntroduction_to_fragmentIntroductionAdvance)
        }
    }
}