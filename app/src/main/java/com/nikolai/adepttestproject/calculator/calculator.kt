package com.nikolai.adepttestproject.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nikolai.adepttestproject.R

class Calculator: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.second_screen_calculator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonPlusF = view.findViewById<Button>(R.id.buttonPlus)
        buttonPlusF.setOnClickListener {
            findNavController().navigate(R.id.action_firstScreen_to_calculator)
        }
        val buttonMinusF = view.findViewById<Button>(R.id.buttonMinus)
        buttonMinusF.setOnClickListener {
            findNavController().navigate(R.id.action_firstScreen_to_calculator)
        }
    }

}