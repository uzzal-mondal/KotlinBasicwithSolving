package FebruaryKOTLIN

fun main (args:Array<String>){


     val name:String? = null;

    // exception throgh hok r setar jonno akta operator ase.

    var na:String?  = null

    println(na!!.length)
    /* assart operator.. ei operator amake bole dai
    null hoile exception  through korte hobe*/



    //else these operator like java ternarry operator.
    val len = name?.length?:-1;
    println(len)



   // println(name?.length)

//    if (name!=null){
//        println(name.length)
//    }


}