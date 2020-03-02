package com.bridgelabz.oop

fun main(args: Array<String>) {
}

// Whatever we describe as abstract we must implemnt it in sub class
abstract class Person{ // we can not instantiate or create object of abstract class
    abstract var name : String
    // abstract declaration shouldn't contaon any body
    abstract /*open*/ fun eat()   // By default abstract properties are open so we don't have
                                  // to declare them open


     open fun getHeight(){  // A open function ready to overridden

     }

    fun goToOffice(){} // A normal function : public final by default
}

class Indian : Person()// This class should override all abstract methods from superclass
{
    override var name: String = "myname"
    override fun eat() {
      //Own code
    }
}