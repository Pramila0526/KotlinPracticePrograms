package com.bridgelabz.oop

fun main(args: Array<String>) {

    var student1 = Student("Pramila",5)
    var student2 = Student("Pramila",5)

    println(student1)  // By default it is toString()
                     // Output without data keyword --com.bridgelabz.oop.Student@816f27d
                  // Output with data keyword -- Student(name=Pramila, id=5)
    if(student1 == student2) // Here we are actually comparing the object reference
        // both object are in different heap memory
    {
        println("Equal")
    }else{
        println("Not Equal")
    }

    var newUser = student1.copy(name="Sagar")  // Copying the Object and we can also change the values
    println(newUser)
}

// The purpose of data class is to deal with data and not object
// so our output will me Equal and without data output will be Not Equal
data class Student(var name : String , var id : Int){

}