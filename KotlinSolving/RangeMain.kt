package MayKotlinSolving.Basic

fun main(args:Array<String>){

    // declare to range in kotlin
    /*
    1.range print
    2.range and step print
    3.reversed print
    4.until print
    5.down to

    */



      // declare to range.. and step
    var range = 0..10 step 2
    range.forEach { print("$it ,") }
    println("\n")

    // reversed function call to array...
    range.reversed().forEach { print("$it , ") }


    // until function...
    println("\n")
    var res = 0 .until(10)
    res.forEach { print(" $it , ") }


    // down to array
    println("\n")
    var rs = 0 downTo 10;
    rs.forEach { print("$it") }



}