package FebruaryKOTLIN

import java.util.*

fun main(args:Array<String>){

    var sc = Scanner(System.`in`)
    println("first num ")
    var a:Int = sc.nextInt();

    println("Second num")
    var  b:Int = sc.nextInt();

    var lcm:Int;


    if (a>b) lcm=a  else lcm=b

    while (true){

        if (lcm%a==0 && lcm%b==0){

            println("The LCM of $a and $b is $lcm.")
            break;
        }

        lcm++
    }

}