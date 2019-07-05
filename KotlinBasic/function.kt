package FebruaryKOTLIN

fun main (args:Array<String>){

      println(isMath(18,3))

}

 fun isMath(n:Int, m:Int):Boolean
         = when{

         n%m == 0 -> true
         else  ->  false
     }
