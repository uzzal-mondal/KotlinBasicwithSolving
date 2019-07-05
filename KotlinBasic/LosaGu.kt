package FebruaryKOTLIN

fun main(args:Array<String>){



      var num1 = 10
      var num2 =  4;
      var l:Int;

     if (num1>num2) {
         l = num1
     }
      else{
         l=num2
     }

    while (l%num1 ==0){

       while (l%num2==0) {

           println(l)

       }

        l++







    }


    println(l)



}