package com.rekoj134.autosizedemo

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object DateTimeUtil {
    fun convertMillisToDate(timeInMillis: Long) : Date {
        return Date(timeInMillis)
    }

    fun convertMillisToDateStr(timeInMillis: Long) : String {
        val curDate: Date = Date(timeInMillis)
        val dateFormatter= SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
        val formattedDate = dateFormatter.format(curDate)
        return formattedDate
    }
}