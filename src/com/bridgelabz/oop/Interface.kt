package com.bridgelabz.oop

fun main(args:Array<String>) {
 var myBtn = Button()
    myBtn.name
    myBtn.onClick()
    myBtn.onTouch()
}

interface MyInterface{  // You cannot create instance of interface class

     var name : String // Properties in Interface are abstract by default

     fun onTouch()  // Methods in Interface are abstract by default
     fun onClick()  // Functions in Interca are public in nature but Not FINAL it is open
     // this function is not abstract in nature because it has a function body
     { // You may or may not override this method because it is a normal method
         println("OnClick Super Method")
     }
}

class Button : MyInterface {
    override var name : String = "clickName"

    override fun onTouch() {
        println("Touched Button")
    }

    override fun onClick() {
        super.onClick()  // It will trigger super class method
        println("Clicked Button")
    }
}