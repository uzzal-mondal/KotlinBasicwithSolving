package FebruaryKOTLIN

import java.util.*

fun main(args:Array<String>){



    var num = Scanner(System.`in`)
    println("Enter your result: - ")
    var showRes = num.nextInt();
    println(" your num : $showRes")

    if (showRes%2 == 0){

        println("this is Even num: "+showRes)
    }else{

        println("this is Odd num: "+showRes)
    }



}