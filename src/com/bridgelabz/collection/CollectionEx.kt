package com.bridgelabz.collection
import java.util.*

/******************************************************************************************************************************
 * Author : Pramila Mangesh Tawari
 * Pupose : Example Of Collections
 * Date   : 26/02/2020
 ******************************************************************************************************************************/

fun main(args:Array<String>) {

    // List Examples
    var nums = listOf(1,2,3,4,5)

    // Numbers in the List
    println("Numbers in the List")
    for(i in nums){
        println(i)
    }

    // Numbers with its index in the List
    println("Numbers with Index")
    for((i,e) in nums.withIndex()){
        println(" $i : $e ")
    }

    // Map Examples

    var data = TreeMap<String,Int>()
    data["Pramila"] = 526
    data["Sagar"]=265

    println("Mapping Example with Key Value Pairs")
    for((name,id) in data){
        println("$name : $id")
    }
}