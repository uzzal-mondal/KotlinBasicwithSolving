package FebruaryKOTLIN

fun main(args:Array<String>){

    val i:Int = 2
    for(j in 1..4)
        print(j)  // prints "1234"

    println("\n")

    if (i in 1..10){
        println("We found your number--"+i);
    }

}