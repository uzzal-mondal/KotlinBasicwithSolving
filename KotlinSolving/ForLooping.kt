package MayKotlinSolving.Basic

fun main(args:Array<String>){




    //factorial try to for loop

    var fac :Int  = 1;
    for (i in 1..5){
        fac = fac*i
    }
         println("Factorial:-  $fac")

    println("\n")

 // adding and average solve to kotlin programming
    var num :Int = 5;
    var sum:Int = 0;
    var avg:Int = 1;


    for (i in 1..5){

        sum = sum+i;
        avg = sum/avg

    }
    println("$sum")
    println("$avg")



    println("\n")

    var arr = arrayOf(10,20,30,40)
    for (i in arr.indices){

        println("Index $i indices of ${arr[i]}")
    }

 println("\n")


    for (i in 1..10){

      if (i%2==0){
          println("even num $i")
      }
    }
}