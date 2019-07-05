package FebruaryKOTLIN

fun main(args:Array<String>){



    // origianl array and reversed arry of..

    var res = arrayOf(1,2,3,4,845,45,48);



     var array2 = res.sliceArray(2..4)
     println("array slice: - ")
     array2.forEach { print("$it ,") }
    println("\n")



    var arr = res.reversedArray();

    var s = res.sortedArray();
     res.sortDescending();


    println("Array of : ")
    res.forEach { print("  $it  ,") }
    println("\n")

    println("Array of Reversed: ")
    arr.forEach { print(" $it , ") }
    println("\n")

    println("Sort Array of : ")
    s.forEach { print(" $it , ") }
    println("\n")

    println("SortDescending Array of : ")
       res.forEach { print("$it ") }
}