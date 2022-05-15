package com.nikolai.adepttestproject.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.nikolai.adepttestproject.R

class Calculator: Fragment() {
    private val viewModel = culculatorVirwModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.second_screen_calculator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val calculatorFirstNumber = view.findViewById<EditText>(R.id.button_to_calculator)
        val calculatorSecondNumber = view.findViewById<EditText>(R.id.button_to_calculator)

        val buttonAdd = view.findViewById<Button>(R.id.buttonPlus)
        val buttonSub = view.findViewById<Button>(R.id.buttonMinus)
        
        val resaltTxte = view.findViewById<TextView>(R.id.textView)

        buttonSub.setOnClickListener {
            val resultVaue = viewModel.destroy()
            resaltTxte.text = resultVaue.toString()
        }
        buttonAdd.setOnClickListener {
            val resultVaue = viewModel.add()
            resaltTxte.text = resultVaue.toString()
        }

        calculatorFirstNumber.addTextChangedListener { fieldValue ->
            viewModel.updateFirstNumber(fieldValue.toString())
        }

        calculatorSecondNumber.addTextChangedListener { fieldValue->
            viewModel.updateFirstNumber(fieldValue.toString())
        }

    }

}