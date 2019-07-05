package FebruaryKOTLIN

import java.util.Locale.filter

fun main(args:Array<String>){

    val items = listOf(1,2,3,4)
     //fast element print.
    println("First element of our list----:"+items.first())

    println("Last element of our list----:"+items.last());

    println();

    println("Even num of our list----"+items
            .filter { it%2==0 })  // returns 2,4

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])  //prints ---1

    val strings = hashSetOf("a","b","c","c")
    println("My set Values are "+strings)




}