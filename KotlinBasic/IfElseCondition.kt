package FebruaryKOTLIN

fun main(args: Array<String>){

    var old :Int = 75;
   var result  =  if (old<=20) "children" else if (old<=40 && old>=21) ":Young man" else "old man"
    println(result);


    var age:Int = 12;

    if (age>20){
        println("He is adult")
    }else if (age>=10 && age<=18){
        println("he is navigator")
    }

    else{
        println("He is children")
    }
}