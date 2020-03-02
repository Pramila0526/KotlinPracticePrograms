package com.bridgelabz.oop

/* Kotlin Inheritance with Primary Constructors
 */

            fun main(args : Array<String>) {

               // when this statement is executed, It simply triggers doggy constructor method(line 20)
                // which interns simply calls Animalss() method and simply calls color as a value
                var dog = Doggy("Black","Pug")
            }


            open class Animalss(var color: String)
            {
                init {
                    println("From Animal Init $color")
                }
            }

            class Doggy(color : String, var breed : String) : Animalss(color)
            {
                init {
                    println("From Dog Init $color and $breed")
                }
            }
