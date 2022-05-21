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
    fun delit(): Int {
        var iO = currentSecondNumber.toInt()
        if (iO != 0) {
            return currentFirstNumber.toInt() / currentSecondNumber.toInt()
        }   else {
            throw Exception("Sus404")
        }
    }
    fun umnosit(): Int {
        return currentFirstNumber.toInt() * currentSecondNumber.toInt()
    }

    fun updateFirstNumber(value: String) {
        currentFirstNumber = value
    }
    fun updateSecondNumber(value: String) {
        currentSecondNumber = value
    }










    }