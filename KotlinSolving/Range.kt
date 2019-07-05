package MayKotlinSolving.Basic

fun main(args:Array<String>){

    /*
     l.learn range with step any num
     2.print to for each function then print method call
     3.Reverse function
     4. down to
     5. until function.
    * */


    var range = 1..10 step 2  // after 3 num , next again num of 6 - 3,6,9,12,15,

    // using to for each function, in range.
    range.forEach { print(" $it ,") }

    println("\n")


    // call to reverse function
    val ran = 1..20
    ran.reversed().forEach { print("$it,") }

    println("\n")

    // down to array function
    var rn   = 15.downTo(1)
   rn.forEach { print("$it , ") }

    println("\n")

    // until function create,
    var un = 1.until(15)
    un.forEach { print("$it,") }





}