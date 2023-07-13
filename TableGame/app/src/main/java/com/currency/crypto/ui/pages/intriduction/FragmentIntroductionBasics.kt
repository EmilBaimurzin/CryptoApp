package layout.intriduction

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.currency.crypto.core.library.soundClickListener
import com.currency.crypto.databinding.FragmentIntroductionBasicsBinding
import com.currency.crypto.ui.other.ViewBindingFragment

class FragmentIntroductionBasics :
    ViewBindingFragment<FragmentIntroductionBasicsBinding>(FragmentIntroductionBasicsBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBack.soundClickListener {
            findNavController().popBackStack()
        }
    }
}