package jp.ac.it_college.std.s21013.kadai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import jp.ac.it_college.std.s21013.kadai.databinding.FragmentGenerationBinding

class GenerationFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentGenerationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGenerationBinding.inflate(inflater, container, false)

        binding.generationList.apply {
            adapter = GenerationAdapter(listOf("全国図鑑", "カントー地方"))
            layoutManager = LinearLayoutManager(requireContext())
        }
        return binding.root
    }

}