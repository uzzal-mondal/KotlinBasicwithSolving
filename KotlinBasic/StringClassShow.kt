package FebruaryKOTLIN

fun main(args: Array<String>) {


    var a = "uzzal mondal \nKhulna GPO - 2000";

    var b = """Uzzal mondal \nKhulkna Gpo -9000"""


    //kotlin  compare to concrat:--

    /*bam paser string boro hole eta positive,
    r dan paser string boro hole eta negative value return korbe ..

     02 ta string soman hole eta 0 return korbe..
     */

    println(a.compareTo(b));
    println("\n")


    println(b.compareTo(a))


    println("\n")



    // kotlin get function to cah search...
    println("Person get to char find now :-  ${a.get(6)}")

    println("\n")


    // print to double cot, and threepol cot.....
    println("$a")
    println("$b")

    // length to kotlin
    println("Person lenght = ${a.length}")
    println("B Length : ${b.length}")

}