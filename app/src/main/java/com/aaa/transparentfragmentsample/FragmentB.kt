package com.aaa.transparentfragmentsample

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aaa.transparentfragmentsample.databinding.FragmentBBinding
import androidx.core.graphics.toColorInt

class FragmentB : Fragment() {
    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        _binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setBackgroundColor("#80000000".toColorInt())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}