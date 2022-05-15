package com.nikolai.adepttestproject.firstScreenMainEEE

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nikolai.adepttestproject.R
import com.nikolai.adepttestproject.calculator.culculatorVirwModel

class FirstScreen: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val calculatorButton = view.findViewById<Button>(R.id.button_to_calculator)



        calculatorButton.setOnClickListener {
            findNavController().navigate(R.id.action_firstScreen_to_calculator)
        }


    }
}