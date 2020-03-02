@file:JvmName("JavaKotlin")  // We can change the class file name using this annotation
package com.bridgelabz.functioncallingfromjava
import com.bridgelabz.functionexpression.max1
/******************************************************************************************************************************
 * Author  : Pramila Mangesh Tawari
 * Purpose : Example to call Kotlin method in java
 *(Function Calling from java)
 * Date     : 26/02/2020
 ******************************************************************************************************************************/

fun main(args:Array<String>) {
    var result2 = com.bridgelabz.functionexpression.add2(1, 22)
    println("A Function to directly add values")
    println(result2)
}

fun add2(a : Int, b: Int) : Int = a + b

fun max1(a : Int, b: Int) :Int = if(a>b) a else b