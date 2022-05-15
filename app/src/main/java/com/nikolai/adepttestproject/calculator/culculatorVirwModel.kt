package com.nikolai.adepttestproject.calculator

class culculatorVirwModel {
    private var currentFirstNumber: String = ""
    private var currentSecondNumber: String = ""

    fun add(): Int {
        return currentFirstNumber.toInt() + currentSecondNumber.toInt()
    }
    fun destroy(): Int {
        return currentFirstNumber.toInt() - currentSecondNumber.toInt()
    }

    fun updateFirstNumber(value: String) {
        currentFirstNumber = value
    }
    fun updateSecondNumber(value: String) {
        currentSecondNumber = value
    }










    }