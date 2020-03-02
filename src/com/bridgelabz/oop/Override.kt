package com.bridgelabz.oop

/* We want to make separate eat methods for separate animal so
   we have to do Overriding

   Example of Overriding Properties and Methods during Inheritance
 */

fun main(args : Array<String>) {

    var dog = Dogs()
    println(dog.color)
    dog.eat()

    var cat = Cats()
    cat.eat()
}

// Classes in Kotlin are by default public final
// so we have to make it open to get extended
open class Animals {

    open var color : String = ""

    // To get Override we have make the function open
    open fun eat(){
        println("Animal Eating")
    }
}

// Commented common functions and variables are going to inherited from Animal Class
class Dogs : Animals() // syntax in kotlin to extend the class
{
    //    var color : String = ""
    var breed : String = ""

    override var color : String = "Brown"

    fun bark(){
        println("Bark")
    }

    // Use Override keyword for method overriding
    override fun eat(){
        super<Animals>.eat()   // Tu run the method of super class
        // super<Animals> is used in case id any extra inerface is there
        println("Dog is Eating")
    }
}

class Cats : Animals() {
    //    var color : String = ""
    var age : Int = -1

    fun meow(){
        println("Meow")
    }
    // Use Override keyword for method overriding
    override fun eat(){
        println("Cat Eating")
    }
}