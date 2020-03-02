package com.bridgelabz.oop

fun main(args:Array<String>) {
    var myBtn = Buttons()
    myBtn.onClick()
    myBtn.onTouch()
}

interface InterfaceOne{  // You cannot create instance of interface class
    fun onTouch()  // Methods in Interface are abstract by default

    fun onClick()  // Functions in Interca are public in nature but Not FINAL it is open
    // this function is not abstract in nature because it has a function body
    { // You may or may not override this method because it is a normal method
        println("OnClick Super Method")
    }
}
interface InterfaceTwo{  // You cannot create instance of interface class

    fun onTouch()  {
        println("In Second Interface: onTouch.. from Interface Two")
    }

    fun onClick()  // Functions in Interca are public in nature but Not FINAL it is open
    // this function is not abstract in nature because it has a function body
    { // You may or may not override this method because it is a normal method
        println("OnClick Super Method")
    }
}

class Buttons : InterfaceOne, InterfaceTwo {
    // onClick Methods are not abstract
    // but still we had to override that because
    // if there are same methods in all interfaces then we must override them
    override fun onClick() {
   //     super.onClick()  // Compiler will confuse because there are two same methods in different Interfaces
        super<InterfaceOne>.onClick()
        super<InterfaceTwo>.onClick()

    }

    override fun onTouch() {
        super.onTouch()  // It will simply trigger onTouch method who has body
    }
}