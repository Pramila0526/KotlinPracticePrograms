/**Author: Pramila Mangesh Tawari
 * Kotlin Makes things easier for you. You just have to create main method.
 * **/

fun main(args: Array<String>){  // Here we first define Variable name and the Variable type
    println("Hello Kotlin World")

    // Here we can change it to val, it will not give any error
    // But further it cannot create new object
    // In val once you assign the value you cannot change it
    var student =  Practice() // For Getting Object of Practice Class, So there is no need of new keyword

    student.name = "Pramila"

    println("(Concatenation) Name is :- " +student.name) // With Concatenation

    println("(Without Concatenation) Name is  :- ${student.name}") // Without concatenation

    student = Practice()

    println("Name is :- ${student.name}")  // Ouput for this is blank(Name is :-     ) , because this is the new object
                                            // and new object will have default value, which is " ", in Practice.kt
}