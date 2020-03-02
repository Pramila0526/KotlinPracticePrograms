package com.bridgelabz.array
import java.util.*
/******************************************************************************************************************************
 * Author : Pramila Mangesh Tawari
 * Pupose : Example Of Arrays
 * Date   : 27/02/2020
 *
 ******************************************************************************************************************************/

fun main(args :  Array<String>) {
    var array = intArrayOf(10,20,5,9,8,63)

    array[1] = 15 // To change the value from an array

    array.set(2,25) // Anothe method To change the value from an array

    println("Array of Integers/Numbers")
    for (i in array)
    print("$i ")


    println(array[4]) // To fetch the value from an array by position

    println(array.last())  // To fetch the last element of an array

    var str1 = arrayOfNulls<String>(7)
    str1.set(1,"Pramila")
    str1.set(2,"Sagar")
    str1.set(3,"Mandar")
    str1.set(4,"Pratiksha")
    str1.set(5,"Sandy")
    str1.set(6,"Ankita")

    println("Array of String")
    for(i in str1)
    print("$i ")

}