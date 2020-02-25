/**Java Kotlin Together Example
 * Refer : JavaKotlin Class
 * **/

fun main(args : Array<String>){

    // Object of JavaKotlin Class
    var student = JavaKotlin(); // Here we got the object

    // Here no need to call setName. It will Call set name by .name(that means you are assigning the value),
    // It will call setName() by default.
    student.name = "Pramila"; // In Kotlin we can  directly set the value by =

    println(student.name);
}

// Everything at the end gets converted into byte code and that's what runs on JVM.