package com.bridgelabz.loops
/******************************************************************************************************************************
 * Author : Pramila Mangesh Tawari
 * Purpose : Example Of For Loops
 * Date    : 26/02/2020
 *
 ******************************************************************************************************************************/

fun main() {
    var num = 1..5

    // Normal For Loop ---
    // Output:- 1 2 3 4 5
    println("Example of Normal For Loop in Kotlin")
    for( a in num){
        println(a)
    }

    // For Loop For alternate numbers according to steps ---
    // Output:- 1 3 5
    println("Example of For Loop with Steps")
    for( a in num step 2){
        println(a)
    }

    // Example for numbers in descending orders using downTo ---
    // Output:- 16 15 14 .........1
    var num1 = 16 downTo 1 // or 16.downTo(1)
    // downTo is asctually a methos which belongs ti Int class
    // wecan also write it as 16.downTo(1)
    println("Example of For Loop with downTo for printing numbers in descending order in Kotlin")
    for(a in num1){
        println(a)
    }

    // Eaxmple of until
    var num2 = 1 until 5  // by using until it will print only till 4 (output:- 1 2 3 4)
    println("Example of For Loop with until in Kotlin")
    for(a in num2){
        println(a)
    }

    println("Example of For Loop with until with reverse also in Kotlin")
    for(a in num2.reversed()){
        println(a)
    }

    // For counting the numbers
    println("Numbers Counts")
    println("Count is ${num1.count()}")

    // CharacterExample

    var characters= 'A'..'z'
    println("For Loop Of Characters in Kotlin")
    for(a in characters){
        println(a)
    }
}