package com.currency.crypto.ui.pages.crypto

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.currency.crypto.R
import com.currency.crypto.core.library.soundClickListener
import com.currency.crypto.databinding.FragmentCryptoBinding
import com.currency.crypto.ui.other.ViewBindingFragment

class FragmentCrypto: ViewBindingFragment<FragmentCryptoBinding>(FragmentCryptoBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBack.soundClickListener {
            findNavController().popBackStack()
        }
        binding.basicInfoLayout.soundClickListener {
            findNavController().navigate(R.id.action_fragmentCrypto_to_fragmentBasicInfo)
        }
        binding.overviewLayout.soundClickListener {
            findNavController().navigate(R.id.action_fragmentCrypto_to_fragmentOverview)
        }
        binding.securityLayout.soundClickListener {
            findNavController().navigate(R.id.action_fragmentCrypto_to_fragmentSecurity)
        }
    }
}