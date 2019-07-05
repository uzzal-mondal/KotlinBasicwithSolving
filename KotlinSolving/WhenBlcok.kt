package MayKotlinSolving.Basic

import java.util.*

fun main(args:Array<String>){

    println("Your input data: - ")
    var sc = Scanner(System.`in`);
    var name:Int = sc.nextInt();


    //One programming
    when(name){

       1 -> print("January")
       2 -> print("February")
       3 -> print("Mearch")
       4 -> print("April")
       5 -> print("May")
       6 -> print("June")
       7 -> print("July")
       8 -> print("August")
       9 -> print("September")
       10 -> print("October")
       11 -> print("November")
       12 -> print("December")

        else -> println("this is user not define")

    }

}