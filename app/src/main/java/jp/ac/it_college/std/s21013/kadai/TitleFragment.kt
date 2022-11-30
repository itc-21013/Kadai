package jp.ac.it_college.std.s21013.kadai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import jp.ac.it_college.std.s21013.kadai.databinding.FragmentTitleBinding
import kotlin.random.Random


class TitleFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentTitleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentTitleBinding.inflate(inflater, container, false)

        binding.btn.setOnClickListener {
            Navigation.findNavController(it).navigate(
                TitleFragmentDirections.actionTitleFragmentToGenerationFragment().apply {

                }
            )
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}