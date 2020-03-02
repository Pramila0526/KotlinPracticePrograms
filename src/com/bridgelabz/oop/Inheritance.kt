package com.bridgelabz.oop

fun main(args : Array<String>) {
    var dog = Dog()
    dog.breed = "Labra"
    dog.color = "White Brown"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = 2
    cat.color = "White Brown"
    cat.meow()
    cat.eat()

    var animal = Animal()
    animal.color = "White"
    animal.eat()
}

// Classes in Kotlin are by default public final
// so we have to make it open to get extended
open class Animal {

    var color : String = ""

    fun eat(){
        println("Animal Eating")
    }
}

// Commented common functions and variables are going to inherited from Animal Class
class Dog : Animal() // syntax in kotlin to extend the class
 {
//    var color : String = ""
    var breed : String = ""

    fun bark(){
        println("Bark")
    }

//    fun eat(){
//
//    }
}

class Cat : Animal() {
//    var color : String = ""
    var age : Int = -1

    fun meow(){
        println("Meow")
    }

//    fun eat(){
//
//    }
}