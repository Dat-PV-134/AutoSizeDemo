package com.rekoj134.autosizedemo

import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.Currency

object CurrencyConverter {
    fun convertToCurrency(money: Double) : String {
        val formatter: NumberFormat = DecimalFormat("#,###")
        return formatter.format(money)
    }
}