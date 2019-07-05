package FebruaryKOTLIN

fun main(args:Array<String>){

    var i:Int;

    i=0;
    while (i<=10){

        if (i%2==0){
            println("Even num "+i)
        }else if(i%2!=0){

            println("Odd num "+i);
        }else{

            println("there is no asign")
        }

        println("num $i")

        i++
    }

}