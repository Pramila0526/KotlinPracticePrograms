package com.bridgelabz.switch

/******************************************************************************************************************************
 * Author    : Pramila Mangesh Tawari
 * Purpose   : Example Of Switch Case in Kotlin
 * Date      : 26/02/202
 ******************************************************************************************************************************/

fun main(args: Array<String>) {

    var num : Int = 2

    // when for switch case
    when(num)
    {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        else -> println("Please give proper Input")
    }

    // when keyword as an expression

    var str = when(num){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        else -> "Please give proper Input"
    }

    println("Output is $str")
}