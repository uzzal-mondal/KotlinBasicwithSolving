package MayKotlinSolving.Basic

fun main(args:Array<String>){


    // We learn it Bitwise operator.

    var a:Int  = 30;
    var b:Int = 10;

    var c:Int;

    // and operator with multiply and convert to decimal.
    c = a and b
    println("Bitwise and operator :  $c")


    // or operator with add and convert to decimal , any num 1 is - 1;
    c = a or b
    println("Or operator : $c")


    // #same num count - 0;   #differ num hoy  -  1  ; #then convert decimal
    c = a xor b
    println("Xor operator $c")


    // left shift operator
    // binary ber korar por right a 2ta bit khali kore dibo, and 00 dara puron kore dibe.
    c= a shl b
    println(" shift hand left $c")

    // right shift operator
    // binary ber korar por left a 2 ta bit khali kore dibo , and 00 dara puron kore dibo.
    c = a shr b
    println("shift hand right $c")






}