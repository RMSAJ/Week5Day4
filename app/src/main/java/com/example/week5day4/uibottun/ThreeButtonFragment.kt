package com.example.week5day4.uibottun

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.example.week5day4.R
import com.example.week5day4.databinding.FragmentThreeButtonBinding

class ThreeButtonFragment : Fragment() {
private val viewmodel: GameViewModel by viewModels()

    private lateinit var binding: FragmentThreeButtonBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_three_button, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.gameViewModel = viewmodel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.add1.setOnClickListener { viewmodel.plusOne }
        binding.sub2.setOnClickListener { viewmodel.minusTwo }
        binding.add4.setOnClickListener { viewmodel.plusfore }
    }
}