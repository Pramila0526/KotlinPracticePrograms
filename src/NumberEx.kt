
fun main(args: Array<String>){
    var num1 : Int = 26
    var num2 : Int = 5

//    var result = num1 + num2

//    println("Additin of $num1 and $num2 is $result")

     var result : Int = 0

    result = if(num1 > num2)
          num1
        else
          num2
        println("Greatest Number is $result")

}