package FebruaryKOTLIN

import java.util.*

fun main (args: Array<String>){


   // var ch: Char = ' '


      var sc = Scanner(System.`in`)
      println("Enter your Data : ")
      var ch = sc.next()[0]
      println("your data is $ch")


    if (ch=='a' || ch=='e' || ch=='i' || ch=='o' ||  ch=='u' ||
            ch=='A' || ch=='E' || ch=='I' || ch=='O' ||  ch=='U'){

        println("Vowel: "+ch)
    }

    else if((ch>='a') && (ch<='z') ||  (ch>='A') && (ch<='Z')){

            println("Consonant : "+ch)
    }

    else if((ch>='0') && (ch<='9'))
    {
        println("Digit number")

    }else if(ch== ' '){

        println("Space now in a select ")
    }

    else{

        println("Symbol of anythings : "+ch)
    }


}