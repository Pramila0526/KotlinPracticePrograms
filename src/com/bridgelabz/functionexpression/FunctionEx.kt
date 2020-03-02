package com.bridgelabz.functionexpression
/******************************************************************************************************************************
 * Author : Pramila Mangesh Tawari
 * Purpose : Example Of Function Expressions
 * Date     : 26/02/2020
 *
 ******************************************************************************************************************************/

            fun main(args:Array<String>) {
                add(5,26)

                var result1 = add1(24,3)
                println(result1)

                var result2 = add2(1,22)
                println("A Function to directly add values")
                println(result2)

                var result3 = max(5,26)
                println("A Function to print Max Number")
                println(result3)

                var result4 = max1(28,25)
                println("A Function to print Max Number in One Line")
                println(result4)

            }

            // Simple Function Example
            fun add(a : Int, b : Int){
                println("Simple Example of Function")
                println(a+b)
            }

            // Function with its return type
            fun add1(a : Int, b: Int) : Int{
                println("A Function with its return type")
                return a+b
            }

            // Function to directly add values in one line
            fun add2(a : Int, b: Int) : Int = a + b

            // Function to Find Max Number
              fun max(a : Int, b: Int) :Int{
                if(a > b)
                    return a
                else
                    return b
            }

            // if else in One Line
            fun max1(a : Int, b: Int) :Int = if(a>b) a else b