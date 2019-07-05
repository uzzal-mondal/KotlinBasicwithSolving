package FebruaryKOTLIN

fun main(args:Array<String>){

    //until method ..
    var ran = 1.until(15);
    ran.forEach { print("$it,") }

    println("")

   // range method
    var range = 2..10 step 2
    range.forEach { println("$it,") }

    //reverse to function
    range.reversed().forEach { print("$it") }

    //downto
    var ranged  = 10.downTo (1);
    ranged.forEach { println("$it") }


}