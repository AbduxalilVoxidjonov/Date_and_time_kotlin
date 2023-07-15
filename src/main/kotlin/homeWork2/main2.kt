@file:Suppress("DEPRECATION")

package homeWork2

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val simpleDateFormat = SimpleDateFormat("dd:MM:yyyy")
    val date = Date()
    println(simpleDateFormat.format(date))

    val date2= Date(2023,11,31)
    simpleDateFormat.format(date2)
    println("Yangi yilgacha ${date2.month-date.month+1} oy va ${date2.date-date.date} kun qoldi")

}