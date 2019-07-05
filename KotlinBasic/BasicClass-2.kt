package FebruaryKOTLIN


fun main(args: Array<String>){

    val a:Int = 10;
    val b:Float = 10.00f;
    val c:Double = 120.35;
    val d:Long = 12456254;
    val e:Short = 1255;
    val f:Byte = 127;
    val ch: Char = 'a';
    val name:String = "Techoners";

    println("Int result- $a");
    println("Float result- $b");
    println("Double result- $c");
    println("Long result- $d");
    println("Short result- $e");
    println("Byte result- $e");
    println("Character result- $ch");
    println("String result- $name");


    //Character

   val letter:Char;



    //Boolean
    val success:Boolean; //definning variables values
    success = true;      // asignning variabales values.
    println("Successful : $success");


    //String
    val names:String
    names = "Hello I am uzzal , I am a new Android App learner";
    println("Name deggination : $names");



    //Arrays
    val number:IntArray
    number = intArrayOf(123,25, 15,14569,145)
    println("This number of $number");

    // collection;
    val numbers: MutableList<Int> = mutableListOf(1,2,3); // mutable list
    val readOnlyView:List<Int> = numbers;         // immutable list.
    println("my mutable list--"+numbers)             // prints("1,2,3")
    numbers.add(4)

     // collection rang baki ase..






}