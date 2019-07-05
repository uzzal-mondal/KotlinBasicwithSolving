package FebruaryKOTLIN

fun main(args: Array<String>){


      var array = intArrayOf();

    for (i in 1..5){

        array = array.plus(i*i);

    }

    array.forEach { println("$it") }


}