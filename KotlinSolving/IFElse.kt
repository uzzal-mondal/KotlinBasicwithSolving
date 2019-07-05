package MayKotlinSolving.Basic

fun main (args: Array<String> ){


    //old
    var age:Int = 21;

    var res = if (age>=0 && age<=20) "children" else if(age>=21 && age<=40) "adult" else "old"
    println("res:-  $res")

    //consonant vowel print
    var c :Char = 'a'
    var ch = if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') "vowel" else "consonant"
    println("$ch")


    // even odd num
    var num:Int = 5
    var sh = if (num%2==0) " even num" else if(num%2!=0) "odd num" else "plz input num"
    print("$sh")


    println("\n")
    // greate and smaller
    var num1 :Int = 10;
    var num2 : Int  = 20;

    var max:Int
    var resShow = if (num1>num2) max=num1 else  max=num2

    println("$max")
}