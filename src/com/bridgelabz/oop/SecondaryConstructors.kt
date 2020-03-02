package com.bridgelabz.oop

/* Kotlin Inheritance with Secondary Constructors
 */

fun main(args : Array<String>) {
    var dog = Parrot("Green","Parakeet")
}


open class Birds
{
    var color :String = " "
    constructor(color: String)
    {
        this.color = color
    println("Inside Birds :- $color ")
    }
}

class Parrot : Birds
{
    var breed : String = " "
    constructor(color : String,  breed : String) : super(color)
    {
         this.breed = breed
     println("Inside Parrot :- $color and $breed")
    }
}
