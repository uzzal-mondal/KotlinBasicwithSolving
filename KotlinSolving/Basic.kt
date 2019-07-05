package MayKotlinSolving.Basic

import java.util.*

fun main(args: Array<String>) {

    // user Input to Kotlin..

      // way  - 1  Integer input to Integer.parseInt(readLine()) method call.
    println("some data print")
    var sc:Int = Integer.parseInt(readLine())
    var res = sc+10

    println("Your data now $res")

    //way - 2  any input including use to Scanner
    println("your data ")
    var scdata = Scanner(System.`in`)
    var name = scdata.nextLine();
    println(" your name is $name")

}