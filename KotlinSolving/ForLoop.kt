package MayKotlinSolving.Basic

fun main(args:Array<String>){

    // for loop declare....
    var arry  = arrayOf(5,10,20,30)
    for (i in arry.indices)  //if i need a index then we are use to indices.
    {
        println("Index = $i and value = ${arry[i]}")
    }


    var arr = arrayOf(5,10,15,20)
    for (i in arr){

        print("$i ,")
    }

     for (i in 0..9){

         if (i%2==0){
             println("even num $i")
         }
     }

}