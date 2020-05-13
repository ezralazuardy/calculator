package com.calculator

import android.view.View

interface Calculator {

    fun onDigit(view: View)

    fun onOperator(view: View)

    fun onClear(view: View)

    fun onEqual(view: View)

    fun onBracketStart(view: View)

    fun onBracketEnd(view: View)

    fun onDecimal(view: View)
}