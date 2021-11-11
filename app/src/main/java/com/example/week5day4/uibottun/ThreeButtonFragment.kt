package com.example.week5day4.uibottun

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
    ): View? {
        binding = FragmentThreeButtonBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        updateScoreOnScreen()
        binding.add1.setOnClickListener { viewmodel.plusOne
        updateScoreOnScreen()}
        binding.sub2.setOnClickListener { viewmodel.minusTwo
        updateScoreOnScreen()}
        binding.add4.setOnClickListener { viewmodel.plusfore
        updateScoreOnScreen()}
    }

   private fun updateScoreOnScreen() {
    binding.displayNum.text = getString(R.string.score,viewmodel.currentScore )


   }


}