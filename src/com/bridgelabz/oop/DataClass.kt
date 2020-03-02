package com.bridgelabz.oop

fun main(args: Array<String>) {

    var student1 = Student("Pramila",5)
    var student2 = Student("Pramila",5)

    if(student1 == student2){
        println("Equal")
    }else{
        println("Not Equal")
    }
}
class Student(name : String , id : Int){

}