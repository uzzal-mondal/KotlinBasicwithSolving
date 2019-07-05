package MayKotlinSolving.Basic

fun main(args:Array<String>){

 // now learn do while loop




    // whiel loop pc: - 03
    var nu = 0;
    var sum = 0;

    while (true){

        nu = Integer.parseInt(readLine())

        if (nu==-1){

            break;
        }

        sum = sum+nu
    }

    println("$sum")




//while loop pc: 2
    var n:Int = 0;
    var s:Int = 0

    while (n!=-1){

       n = Integer.parseInt(readLine())
        s = s+n
    }

    println("$s")



    println("\n")


    //while loop pc: 1
    var num = 0;
    var i :Int = 1

    while (i<=10){

        println("$i")
        i++
    }
}