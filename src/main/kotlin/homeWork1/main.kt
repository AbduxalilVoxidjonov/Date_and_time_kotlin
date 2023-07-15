@file:Suppress("DEPRECATION")

package homeWork1

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val simpleDateFormat = SimpleDateFormat("dd:MM:yyyy")
    val date = Date()
    println("Tug'ilgan yilingizni kiriting: dd:MM:yyyy")
    val str1= readln()
    val date1= simpleDateFormat.parse(str1)
    if (date.month-date1.month<0){
        println("Siz hozirda ${date.year-date1.year-1} yilu, ${date1.month-date.month} oy yashagansiz.")
    }else{
        println("Siz hozirda ${date.year-date1.year} yilu, ${date.month-date1.month} oy yashagansiz ")
    }
}