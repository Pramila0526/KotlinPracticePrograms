package com.bridgelabz.functioncallingfromjava;
/******************************************************************************************************************************
 * Author : Pramila Mangesh Tawari
 * Pupose : Example to call Kotlin method in java
 * (Function Calling from java)
 *
 ******************************************************************************************************************************/

public class Runner {
    public static void main(String[] args) {

        // By default Kotlin Methods are static
//        int result = JavaKotlinKt.add2(5,8);
        int result = JavaKotlin.add2(5,8);

        System.out.println(result);
    }
}
