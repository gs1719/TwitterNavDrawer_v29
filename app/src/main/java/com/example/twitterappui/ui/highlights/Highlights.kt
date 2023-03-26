package com.example.twitterappui.ui.highlights

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.twitterappui.R
import com.example.twitterappui.databinding.FragmentHighlightsBinding

class Highlights : Fragment() {

    private var _binding: FragmentHighlightsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val highlightViewModel = ViewModelProvider(this).get(HighlightsViewModel::class.java)
        _binding = FragmentHighlightsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val textView: TextView = binding.textHighlight
        highlightViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}