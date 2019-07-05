package FebruaryKOTLIN

fun main(args: Array<String>) {


//    kotlin String Declear.

    var a:String = "Name: John,\n  Age:20"
    val b:String = """Name : Uzzal,\n Age:20"""

    println("String print :")

    /* String print */
    println("Person Stirng is : $a")
    /*  String print */
    println("B Stirng is : $b")





    println("\n")
    println("  String length print : ")

    /*  String length print  */
    println("B Stirng is length : ${b.length}")
    println("Person String is length :${a.length}")







    println("\n")
    println("  String concat:-  ")

    /* String concat:- */
    val ages:String = "age : 20"
    val name:String = "CName: Techoners , Age : 2 Years, $ages"

    println("Concat Name  = $name")









    /* String value print : - */
    println("\n")
    println("Strng get Index value print ")
    println("String get index: ${ages[6]}");




    /*String compare to  print : - */
    var  co:String = "do you want copy?"
    var tea:String  = "Do you wnat tea?"

    println(" compare to String : ${co.compareTo(tea)}");
    println("compate to String : ${tea.compareTo(co)}");
    println("compate to String : ${co.compareTo(tea,true)}");
    /*1.bam paser string ta jodi booro hoy tahole positive return korbe
      2. dan paser string ta jodi boro hoy tahole aeta negative return korbe
      3. r jodi soman soman hoy thaole eta 0 retun korbe..
      4. small letter thakle sei string tai boro hobe..
      5. capital letter thakle sei string tai soto hobe.
      6. upper case lower case kono matter tahkbena , true korle*/



     /* contains function , kono variable  er moddhe substring ase kina eta check korar jonno
       contains function use korboo...  */

      println("Contains substring : - ${tea.contains("Do")}")

     /* 1. Do - capital letter ejonno false retrun korbe.
        2. do - small  letter ejonno true return korbe.
        3. upper case ignore korar jonno amara , true use korle true return korbe.*/




    /* startwith*/









}