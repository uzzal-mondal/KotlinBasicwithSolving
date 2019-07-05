package FebruaryKOTLIN

import java.util.*

fun main(args:Array<String>){

    var num:Int;
    var sc = Scanner(System.`in`)
    println("Enter your data: ")
    num = sc.nextInt();


   when(num){

       0 -> println("Zero")
       1 -> println("One")
       2 -> println("Two")
       3 -> println("Three")
       4 -> println("Four")
       5 -> println("Five")

       else -> println("This is value is not a define")

   }


}