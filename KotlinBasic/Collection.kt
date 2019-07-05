package FebruaryKOTLIN

fun main(args:Array<String>){


    // collection in variable

    val numbers:MutableList<Int> =  mutableListOf(1,2,3) // mutable list
    val readOnlyView: List<Int> = numbers  //immutable list.

    println("my mutable list "+numbers); //print 1,2,3.


    // akta number add korte chai
    numbers.add(4);
    println("my mutable list of after addition : "+numbers);
    println(readOnlyView)




}