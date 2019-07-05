package FebruaryKOTLIN

fun main (args:Array<String>){





     //nested loo in kotlin

    for (i in 1..5){

        for (j in 1..i){

            print("*")
        }

        println()
    }



    var lf = listOf(10,25,35,36,34,32,321,15)
    for (i in lf.indices){

        println("index of = $i list of = ${lf[i]}")
    }

    println("\n")


    var arrOf = arrayOf(10,20,30,40,50,60,80)
    for (i in arrOf.indices){

        println("Index of =  $i  and value of = ${arrOf[i]}")
    }


//    var i:Int
//
//    for (i in 2..10 step 4){
//
//        println("this in num of : $i")
//    }


//    var i:Int;
//
//    i = 10;
//    while (i<=20){
//
//        if (i%2==0){
//
//            println("it's even num $i")
//        }else{
//
//            println("it's odd num $i")
//        }
//
//        println(" " )
//
//        println("this is minium $i")
//
//        i++
  //  }
}