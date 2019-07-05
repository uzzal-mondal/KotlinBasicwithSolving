# KotlinBasic

 Kotlin Basic
Create Kotlin file, main function , print something

Ex: package FebruaryKOTLIN

/*
        hello , I am uzzal. Beginner to Kotlin programming language.
        Authority

 */

 fun main(args: Array<String>){

     println("my Techoners")
 }

 Var- variable, res – variable name,  String – Datatype – Techoners – value,  we have to done println res and res length
1.	Multi line comments - /* */

2.	Single line comments - //

3.	Fun – fun is keyword used to denote that, this is call is function.


4.	 Main – main is main method / function , where there is programming execute . 
5.	Args – This is the parameter name, parameter follow the variables properties. 

6.	Array – array is accepting Generic type or it is a parameter type. Unlike other language. Kotlin variable comes first and then variable types.


7.	<String> - String is a Generic type . disscuss to about Generic.

8.	() - Bracket used to contains elements inside the block. 


9.	Println – user write to in a here and show the program by console.

Tutorial  :  1

package FebruaryKOTLIN

/*
        hello , I am uzzal. Beginner to Kotlin programming language.
        Authority

 */

fun main (args:Array<String>){

    println("My Techoners is awesome place to day by day learning progress");
    System.out.println("Kotlin is wonder , cause of no null point exception.");


                   /*variable working now start*/

    var name  = "uzzal\n by techoners \n learning to \n Java, Kotlin, Android. \n Welcome";
    println("My name is: $name");


      // print to name with properties
    var compayName = "Techoners"
    println("Job Carirer Start to - "+compayName+"\n  By Techoners properties - "+compayName.length);



    // print to name with properties other's method
    var showName  = "uzzal"
    println("Name ${showName.length}")

    //number value
    var a = 10;
    var b = 320;

    print(a+b);



}


Kotlin Basic /type – 0 2

package FebruaryKOTLIN

import javax.swing.plaf.multi.MultiLabelUI


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
    letter = 'A';
    println("Letter $letter")

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

ctrl+b – to show all datatype.
Numbers
The representation of numbers in Kotlin is pretty similar to Java, however, Kotlin does not allow internal conversion of different data types. Following table lists different variable lengths for different numbers.
Type	Size
Double	64
Float	32
Long	64
Int	32
Short	16
Byte	8
Characters
Kotlin represents character using char. Character should be declared in a single quote like ‘c’. Please enter the following code in our coding ground and see how Kotlin interprets the character variable. Character variable cannot be declared like number variables. Kotlin variable can be declared in two ways - one using “var” and another using “val”.
 Live Demo
fun main(args: Array<String>) {
   val letter: Char    // defining a variable 
   letter = 'A'        // Assigning a value to it 
   println("$letter")
}
The above piece of code will yield the following output in the browser output window.
A
Boolean
Boolean is very simple like other programming languages. We have only two values for Boolean – either true or false. In the following example, we will see how Kotlin interprets Boolean.
 Live Demo
fun main(args: Array<String>) {
   val letter: Boolean   // defining a variable 
   letter = true         // Assinging a value to it 
   println("Your character value is "+"$letter")
}
The above piece of code will yield the following output in the browser.
Your character value is true
Strings
Strings are character arrays. Like Java, they are immutable in nature. We have two kinds of string available in Kotlin - one is called raw String and another is called escaped String. In the following example, we will make use of these strings.
 Live Demo
fun main(args: Array<String>) {
   var rawString :String  = "I am Raw String!"
   val escapedString : String  = "I am escaped String!\n"
   
   println("Hello!"+escapedString)
   println("Hey!!"+rawString)   
}
The above example of escaped String allows to provide extra line space after the first print statement. Following will be the output in the browser.
Hello!I am escaped String!

Hey!!I am Raw String!
Arrays
Arrays are a collection of homogeneous data. Like Java, Kotlin supports arrays of different data types. In the following example, we will make use of different arrays.
 Live Demo
fun main(args: Array<String>) {
   val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
   println("Hey!! I am array Example"+numbers[2])
}
The above piece of code yields the following output. The indexing of the array is similar to other programming languages. Here, we are searching for a second index, whose value is “3”.
Hey!! I am array Example3
Collections
Collection is a very important part of the data structure, which makes the software development easy for engineers. Kotlin has two types of collection - one is immutable collection (which means lists, maps and sets that cannot be editable) and another is mutable collection (this type of collection is editable). It is very important to keep in mind the type of collection used in your application, as Kotlin system does not represent any specific difference in them.
 Live Demo
fun main(args: Array<String>) { 
   val numbers: MutableList<Int> = mutableListOf(1, 2, 3) //mutable List 
   val readOnlyView: List<Int> = numbers                  // immutable list 
   println("my mutable list--"+numbers)        // prints "[1, 2, 3]" 
   numbers.add(4) 
   println("my mutable list after addition --"+numbers)        // prints "[1, 2, 3, 4]" 
   println(readOnlyView)     
   readOnlyView.clear()    // ⇒ does not compile  
// gives error  
}
The above piece of code will yield the following output in the browser. It gives an error when we try to clear the mutable list of collection.
main.kt:9:18: error: unresolved reference: clear
   readOnlyView.clear()    // -> does not compile  
                 ^
In collection, Kotlin provides some useful methods such as first(), last(), filter(), etc. All these methods are self-descriptive and easy to implement. Moreover, Kotlin follows the same structure such as Java while implementing collection. You are free to implement any collection of your choice such as Map and Set.
In the following example, we have implemented Map and Set using different built-in methods.
 Live Demo
fun main(args: Array<String>) {
   val items = listOf(1, 2, 3, 4)
   println("First Element of our list----"+items.first())
   println("Last Element of our list----"+items.last())
   println("Even Numbers of our List----"+items.
      filter { it % 2 = = 0 })   // returns [2, 4]
   
   val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
   println(readWriteMap["foo"])  // prints "1"
   
   val strings = hashSetOf("a", "b", "c", "c")
   println("My Set Values are"+strings)
}
The above piece of code yields the following output in the browser.
First Element of our list----1
Last Element of our list----4
Even Numbers of our List----[2, 4]
1
My Set Values are[a, b, c]
Ranges
Ranges is another unique characteristic of Kotlin. Like Haskell, it provides an operator that helps you iterate through a range. Internally, it is implemented using rangeTo() and its operator form is (..).
In the following example, we will see how Kotlin interprets this range operator.
 Live Demo
fun main(args: Array<String>) {
   val i:Int  = 2
   for (j in 1..4) 
   print(j) // prints "1234"
   
   if (i in 1..10) { // equivalent of 1 < = i && i < = 10
      println("we found your number --"+i)
   }
}



Collection & Range : -03
Collection and range
Collection is a very important part of the data structure, which makes the software development easy for engineers. Kotlin has two types of collection - one is immutable collection (which means lists, maps and sets that cannot be editable) and another is mutable collection (this type of collection is editable). It is very important to keep in mind the type of collection used in your application, as Kotlin system does not represent any specific difference in them.

fun main(args: Array<String>) { 
   val numbers: MutableList<Int> = mutableListOf(1, 2, 3) //mutable List 
   val readOnlyView: List<Int> = numbers                  // immutable list 
   println("my mutable list--"+numbers)        // prints "[1, 2, 3]" 
   numbers.add(4) 
   println("my mutable list after addition --"+numbers)        // prints "[1, 2, 3, 4]" 
   println(readOnlyView)     
   readOnlyView.clear()    // ⇒ does not compile  
// gives error  
}
Output: 
my mutable list [1, 2, 3]
my mutable list of after addition : [1, 2, 3, 4]
[1, 2, 3, 4]
In collection, Kotlin provides some useful methods such as first(), last(), filter(), etc. All these methods are self-descriptive and easy to implement. Moreover, Kotlin follows the same structure such as Java while implementing collection. You are free to implement any collection of your choice such as Map and Set.
In the following example, we have implemented Map and Set using different built-in methods.

package FebruaryKOTLIN

import java.util.Locale.filter

fun main(args:Array<String>){

    val items = listOf(1,2,3,4)
     //fast element print.
    println("First element of our list----:"+items.first())

    println("Last element of our list----:"+items.last());

    println();

    println("Even num of our list----"+items
            .filter { it%2==0 })  // returns 2,4

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])  //prints ---1

    val strings = hashSetOf("a","b","c","c")
    println("My set Values are "+strings)




}


Range:

package FebruaryKOTLIN

fun main(args:Array<String>){

    val i:Int = 2
    for(j in 1..4)
        print(j)  // prints "1234"

    println("\n")

    if (i in 1..10){
        println("We found your number--"+i);
    }

}



Kotlin Part : 02
Kotlin User Input
1.	Java te Scanner / buffer reader use kore input neoa ta familiar.

         Way to 2”-
2.	 User input in Kotlin  - readLine.
3.	 Int input – integer.parseInt(readline)

package FebruaryKOTLIN

import java.util.*

fun main(args:Array<String>){



    ///////////////////////   4
    var sc = Scanner(System.`in`)
    println("Enter your Result")
    var showres = sc.nextInt();
    println("Show Result : $showres");




    ///////////////////////////////   3
    println("Input marks count: ")
    var res = readLine();

    if (res!=null){
      var marks =  res.toInt();
        println(marks+10);

    }


    ///////////////////////////////   2
    println("Please input now")
    var num = Integer.parseInt(readLine());
    println("Your num is :-"+num);

    ///////////////////////////////   1

    println("Please input now")
     var  name = readLine();
    println("Please input now")
    println("Name is : $name")


}








Kotlin Part: 03
Kotlin Data type and variable
1.	Long
2.	Integer
3.	Short 
4.	Boolean
5.	String
6.	Byte 
7.	Double.
8.	Var = when a time I can change the value
9.	Val = I don’t change the value. Static like java.
10.	Var x:Int = 10;    var then value:Datatype , then value initilizze…..



 

       









Kotlin When Key Word
Like java switch.
Switch , case , break , default
When(num) then body, case to add body
 then else

package FebruaryKOTLIN

import java.util.*

fun main(args:Array<String>){

    var num:Int;
    var sc = Scanner(System.`in`)
    println("Enter your data: ")
    num = sc.nextInt();


   when(num){

       0 -> println("Zero")
       1 -> println("One")
       2 -> println("Two")
       3 -> println("Three")
       4 -> println("Four")
       5 -> println("Five")

       else -> println("This is value is not a define")

   }


}



Kotlin Naming Conversation
Programming amara onek kisu name dei :-
1.package   2.Class    3. Interface
4.method / function    5.variables 6. Constants

1.Package name:-  package name all time lower case diye suru hoy. Underscore to joint multiple words.  Kono letter capital korte parbona. 

Ex: package name:- 
 com.uzzal.kotlin
   					com.uzzal_kotlin_project


2. Class Name: -  class name all time captital letter diye start hoy. And camel case join to multiple words.

Ex: Student
StudentInformationProject

3. Interface Name: - Interface name and class name same way to use this programming.
Interface and class name start to Upper case letter and multiple line join to camel case letter.
Ex: Data
Ex: DataInformation

4. Method name start  to lower case letter, 
And join to camel case multiple words.
Ex: myPen();   println(),  myBookReadding();


Variables name:-  lower case uset to starting , next Uppercase use to join multiple class.
Ex: myComputer;    learnJavaBook;

Constants Name: ALL CLASS USE TO UPPER CASE. WITH JOIN TO MULTIPLE CLASS USE TO UNDER SCORE  UPPER CASE.

EX: MY_BOOK_JAVA_LEARNING;
EX:  BOOK 

Bitwise Operator
1.	Amara Jani amader computer bit niye kaj kore. Sorasori bit niye j operator kaj kore take bola hoy bitwise operator.
2.	










3.	Bitwise        (a and b)
4.	Bitwise  	(a or b)
5.	Bitwise 		(a  xor b)
6.	Bitwise		(a shl 2)
7.	Bitwise 		(a shr 2)


Bitwise and operator:-
       

Bitwise and      operator holo akta num ke arek ta num er sathe gun kora. Then amder convert korte hobe decimal a.   



 



Bitwise | operator:
Bitwise | operator holo akta num er sathe arekta num er  (add/jog)  kora. Orthat konota Jodi 1 hoy at least ter  num hobe 1.   Konta check kore 1 hole ter num 1.

   











Bitwise xor(^) operator:
Bitwise xor operator holo akta num and onno akta num Jodi alada alada hoy, and kono akta num Jodi bijor numbder hoye thake tokon amara tahke bitwise xor operator bole thakbooo… Jodi akoi num hoy then 1,1 hoy tokon vinnoo na howar karone 0 hobe..






Tokon calculate kore amara binary to decimal a convert korbo…
Bitwise leftShift operator:
J kono num(25) binary ber korar por , right er 2 ta bit khali kore dibo and oviously 0 0 dara purno kore 






diboo , ei value take amara decimal a convert kore dibo… 
Bitwise RightShift operator:
Bam paser 02 ta bit sore jabe r tokon bam paser 02 ta bit khali hoye jabe r jokon eta hobe bam paser 02 ta bit ke 0 dara purnoo kore diboo..  

whit binary to decimal convert korboo………………@







                                       Programming
package FeburaryJAVA;

public class BitwiseOperator {

    public static void main(String args[]){



        int a = 32;
        int b = 12;

        int c;

        c = a&b;
        System.out.println("A & b operator "+c);


        c = a|b;
        System.out.println("A | B operator "+c);

        c = a^b;
        System.out.println("A ^ B operator: "+c);


        c = a>>b;
        System.out.println("A>> RightShift operator:- "+c);


        c = a<<b;
        System.out.println("A<< leftshift operator:- "+c);


    }
}


Range operator in Kotlin:-  16.02.19
Range:
1.	Range operator.
2.	Reversed method .
3.	Step method 
4.	Down to .
5.	Until method .

1.	Range holo akta boundary jer vitore elements guli sequentially maintain kore thake. Seta akta boundary er moddhe. 

2.	Range er akti static point and akti ending point thakbe.
Ex: 1..10, A..Z
1 theke 10; A theke Z sobguli akta sequentially ase

3.	Why can use range:?  
1..10 othoba A..Z  every element access nite  hole amder jeta projon seta holo  akta array. To se kaj ti amara khub shojei range er moddhe niye korte parsi. 

4.	Lets start to use range operator:
Range declare korte hole amder range operator use korte hoy. 
Ex: var range = 1..10;
5.	Range print korar jonno amara jeta korbo, forearch method ti use korbo..

6.	Range.forEach{ print(”$it”) }

7.	Mojar bapar holo Jodi amara 1 step ba 2 step print korte try kori tahole amara step keyword ti use korte pari.

                          Reverse method 

1.	Reverse to menthod er kaj holo sob gulo num ultano..
Ex: Range.reverse.forEach{print(“$it”)}

2.	 Reverse er jagai amara downto ei method ti   use korte pari.
//downto
var ranged  = 10.downTo (1);
ranged.forEach { println("$it") }



Until method
1.	Until method ti range er moton akti function jar boundar range er theke 1 kom hoy.
Ex: //until method ..
var ran = 1.until(15);
ran.forEach { print("$it,") }

2.	Kotlin a range too much important matter’s range use kore amara array/arrayList/loop er kaj gulo o korte pari…..


Basic Kotlin Conditional Statement Learn If – Else     17/02/19
1.	Java if else Kotlin if else there is no different but only one major problem can through.:-

package FebruaryKOTLIN

fun main(args: Array<String>){


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

2.	Major different of Kotlin language:-

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


Next:- 
package FebruaryKOTLIN

fun main(args:Array<String>){


    val a: Int = 12;
    val b: Int = 2;

    var max:Int;

    if (a>b){
        max = a;

    }else{

        max = b;
    }

    println("The Max num  of input : $max")
}



Cappital and Small letter Kotlin

package Java67Today

import java.util.*

fun main(args:Array<String>){


    // capita ans small letter

     var sc = Scanner(System.`in`)
    println("Enter your data: ");
    var ch = sc.next()[0]

    if (ch>='A' && ch<'Z'){
        println("Capital letter : "+ch)
    }
    else if(ch>='a' && ch<='z'){

        println("small letter")
    }else{
        println("Your input is wrong")
    }

}

Kotlin Even Odd Problem
1.	Scanner class get this input .
2.	Koto num nisi user input niye print korsi
3.	Sei num er sathe condition make korsi. 
4.	Sei condition ta even 2 tai 2 er sathe vag kore nisshe bivajjo Jodi 0 hoye thake tahole
5.	Tahole ami akta statement didi seta print koro even ..
6.	R Jodi nishese bivajjo 0 na hoye thake tahole j statement dillam seta print koro odd number.



package FebruaryKOTLIN

import java.util.*

fun main(args:Array<String>){



     var num = Scanner(System.`in`)
    println("Enter your result: - ")
    var showRes = num.nextInt();
    println(" your num : $showRes")

    if (showRes%2 == 0){

        println("this is Even num: "+showRes)
    }else{

        println("this is Odd num: "+showRes)
    }



}

Kotlin Consonant vowel
1.	Scanner class k call kore input neyesi
2.	Akta variable a rekhe sc.next()[0] 
0 tomo posoiton make korsi.
3.	Then print korsi input ti
4.	Condition  make korlam fast vowel upper or lower
5.	Second digit , space , symbol
6.	Then sobar condition er statement diyesii

package FebruaryKOTLIN

import java.util.*

fun main (args: Array<String>){


   // var ch: Char = ' '


      var sc = Scanner(System.`in`)
      println("Enter your Data : ")
      var ch = sc.next()[0]
      println("your data is $ch")


    if (ch=='a' || ch=='e' || ch=='i' || ch=='o' ||  ch=='u' ||
            ch=='A' || ch=='E' || ch=='I' || ch=='O' ||  ch=='U'){

        println("Vowel: "+ch)
    }

    else if((ch>='a') && (ch<='z') ||  (ch>='A') && (ch<='Z')){

            println("Consonant : "+ch)
    }

    else if((ch>='0') && (ch<='9'))
    {
        println("Digit number")

    }else if(ch== ' '){

        println("Space now in a select ")
    }

    else{

        println("Symbol of anythings : "+ch)
    }


}


Kotlin Max and Min Number:
1.num2 theke num1 boro seta holo Maximum num num1>num2
2. num1 er theke jeta num2 boro seta holo minimum number . num2>num1
package Java67Today

import java.util.*

fun main(args:Array<String>){


    // Maximum  num and Minimum number

    var sc = Scanner(System.`in`)
    println("Your fast number")
    var num1  =  sc.nextInt();
    println("Your second number")
    var num2 = sc.nextInt()

    if (num1>num2){

        println("Maximum num: "+num1)
    }else if(num2>num1){
        println("Minimum num : "+num2)
    }else{

        println("equal")
    }





}

Kotlin Possitve Negative num
package Java67Today

import java.util.*

fun main(args:Array<String>){



    var sc = Scanner(System.`in`);
    println("Enter your num: - ")
    var num = sc.nextInt();
    println("this is num $num")



    if (num>=0){
        println("Num is a possitive")
    }

    else if(num<0){

        println("Num is  a Negative")
    }else{

        println("Num is not a define"+num)
    }


}

Exam Gpa 19.02.19 kotlin

package Java67Today

import java.util.*

fun main(args: Array<String>) {


    // Gpa count to students

    var sc = Scanner(System.`in`)
    println("user input your data : ")
    var gpa = sc.nextDouble();
    println("Your input data is $gpa")

    if (gpa<=100 && gpa>=80){

        println("Your result is A+  - "+gpa)
    }
    else if (gpa<=79 && gpa>=70){

        println("Your result is A - "+gpa)
    }

    else if (gpa<=69 && gpa>=60){

        println("Your result is A- "+gpa)
    }


    else if (gpa<=59 && gpa>=50){

        println("Your result is B - "+gpa)
    }


    else if (gpa<=49 && gpa>=40){

        println("Your result is C - "+gpa)
    }

    else if (gpa<=39 && gpa>=33){

        println("Your result is D - "+gpa)
    }


    else if (gpa<=32 && gpa>=0){

        println("Your result is faiuler F - "+gpa)
    }

    else{

        println("You can't change upper the 100, cause of Total mark's 100  -  "+gpa)
    }






}

Leap year 19.02.19

package Java67Today

import java.util.*

fun main(args: Array<String>) {


    // Leap year

    // var leapYear:Double;

    var sc = Scanner(System.`in`)
    println("Enter your user data : - ")
    var leapYear = sc.nextDouble();
    println("User Data : $leapYear ")

       if (leapYear%4 == 0.0){

           println("Leap Year == "+leapYear)
       }
        else if(leapYear%400 == 0.0){
           println("Leap Year - "+leapYear)
       }else if(leapYear%100 == 0.0){
           println("Leap Year : ")
       }else{

           println("Not a Leap year : - "+leapYear)
       }
}



Kotlin for Loop
1.	There are three kinds of loop
#for loop, while loop, doWhileloop




For loop:

# for loop use korte hole fast for keyword 

#erpor parent thisis ba fast bracket dite hobe

#er vitore 03 ta jinish thake fast akta variable assign

# erpor akta condition eta decession nai amar loop ta koto bar cholbe. True hoele start false hole stop


# i  value ta update / in/ de crement hobe  
# erpor loop er akta body thakbe..

Loop run howar somoy Compiler kivabe kaj kore

for (i in 1..10){

  if (i%2==0){
      println("even num $i")
  }
}


var arr = arrayOf(10,20,30,40)
for (i in arr.indices){

    println("Index $i indices of ${arr[i]}")
}

var num :Int = 5;
var sum:Int = 0;

for (i in 1..5){

    sum = sum+i;
    println("$sum")
}



 For(int i=0; i<=5; i++){
      
			If(i%2==0){

}
}

1.	Fast i er value ta 0 asign kore nibe. For loop er kehettre ei i er value ta akbari assign hoy. Bar bar ei  -  i  -  er j value kaj korbena.

2.	Condtion check korbe j amder condition true ki false jehetu I er man 0 e khettre condition true hobe. Karon 0 , 5 er theke soto.

3.	Akon i er value ak barbe , ekhane amara post increment operator ti use korsi. 

4.	Akon i er man 1 barbe kintuo ei loop er moddhe i er man 0 ei thakbe. Post increment a i er man jokon pore pai tokon barte thake. Jehetu eta post increment e joonoo barbena.

5.	Compile akon loop for er vitore dukhbe. And condition ta check korbe, condition Jodi true hoy tahole print korbe. E khettre condition true. Tai 0 print korbe.


6.	Kintuo akon r i er value 0 eta ar assign korbena 

Kotlin When Statement


package FeburaryJAVA

import java.util.*

fun main(args:Array<String>){


    val week:Int;

    val sc = Scanner(System.`in`)
    println("Your Input data: - ")
    week = sc.nextInt();
    print("Week data name:- ")

     when(week){

         1-> println("Saturday");

         2-> println("Sunday");

         3-> println("Monday")

         4-> println("Tuesday")

         5-> println("wednesdays")

         6-> println("Thursday")

         7-> println("Friday and is off day")

         else-> println("this your data is existing")


     }
}


// new programming when in Kotlin......  2  @@@@@@@@@@@@@@@ .......





package FeburaryJAVA

import java.util.Scanner

object SwitchExam {

    @JvmStatic
    fun main(args: Array<String>) {

        val week: Int
        var dayString: String

        val sc = Scanner(System.`in`)
        println("Input your week name")
        week = sc.nextInt()
        dayString = sc.nextLine()
        print("Your week name is : - ")


        when (week) {

            1 -> dayString = "Saturday"

            2 -> dayString = "Sunday"

            3 -> dayString = "Monday"

            4 -> dayString = "Tuesday"

            5 -> dayString = "Thursday"

            6 -> println("Thursday")

            7 -> dayString = "Friday"

            else -> print("your data is existing")
        }


        println(dayString)

    }
}


// new programming when in Kotlin......  3 @@@@@@@@@@@@   .......


package FeburaryJAVA

import java.util.*

fun main(args:Array<String>){


    val month:Int;

     val sc = Scanner(System.`in`)
    println("Your Input month Name: - ")
     month = sc.nextInt();
    print("Your month name  is - $month : - ");

    when(month){

        1-> println("January")
        2-> println("February")
        3-> println("March")
        4-> println("April")
        5-> println("May")
        6-> println("June")
        7-> println("July")
        8-> println("August")
        9-> println("September")
        10-> println("October")
        11-> println("November")
        12-> println("December")

        else -> println("Month is not define..")


    }
}





// new programming when in Kotlin.....4.......@@@@@@@@@@@@


package FeburaryJAVA

import java.util.*

fun main(args: Array<String>) {

    var digit:Int;



    var sc = Scanner(System.`in`);
    println("Input your data: ")
     digit = sc.nextInt();
    println("Input data:")

    when(digit){

        1-> println("One");

        2-> println("Two")

        3-> println("Three")

        4-> println("Four")

        5-> println("Five")

        else-> println("Your num don't  match the expression..")



    }


}


// switch case to noe of 5 Kotlin....@@@@@@@@@
package FeburaryJAVA

import java.util.Scanner

object SwitchTextPoint {

    @JvmStatic
    fun main(args: Array<String>) {

        val grade: String

        val sc = Scanner(System.`in`)
        println("Your Grade Point type in a here")
        grade = sc.nextLine()
        println("YOur Grade result $grade :- ")


        when (grade) {


            "a+" -> println("Your result is Excellent")

            "a", "a-" -> println("Your result is Godd")

            "b", "c" -> println("Your result is Medium")

            "d" -> println("Your result is passed")

            "f" -> println("Your result is Fail")

            else -> println(":Your result is not a define")
        }


    }
}


Kotlin For Loop : 23/02/19
1.	Kotlin er for loop kisuta java er for each loop er moton kaj kore.

2.	# First for keyword.-for
# second parentthisis –for()
# third counter variable –for(i)
# i declare ba intilize korar projon nei.
# in -  operator dibo condition do work.
# then akta range dite hobe - 1.10

For(i in 1..10)

3.	Jodi amara 2/3 step kore print korte chaitam. Tahole amader step keyword ti use korte hoto. Er mane holo counter variable er man 2 step kore increment holo.


4.	Array for loop aply
var arr = arrayOf(5,20,30,35,50)

5.	Print kore dakbo print korar jonno same way te for loop chaliyesi. Kitnuoo range neaor kono projon nei. Karon array neijei range er moton kaj korbe.

6.	for(i in arr){
println(“$i”)
}
7.	Jodi amader index dorker hoy tahole i ei j system eta kaj korbena.
karon amara daksi ekhane i value take nisse kintu index take nissena.

8.	Index neoar jonno arr akta function add korte hobe indices.
arr.indices()

9.	Println(index = $i  and value = ${arr[i]}

amara ekhane array er index i and value array er i ti print korte parbo.

10.	Thik akoi way te amara list map j kono way te collection niye kaj korte pari.

11.	 How to use nested loop in Kotlin..

12.	Nested loop onek beshi kaje lage jokon amara 2 dimentional array niye kaj korboo.

Example in for loop
Twinkle cat’s
package FebruaryKOTLIN

fun main(args: Array<String>){

    // how to use nested loop in kotlin.

      // nested for loop
    for (i in 1..5){

        for (j in 1..i){

            print("*")
        }

        println()
    }

         // for loop array

//    var arr = arrayOf(10,105,20,30);
//
//    for (i in arr.indices){
//
//        println("Index of array: $i , and value of ${arr[i]}")
//
//
//    }

             // for loop

//     for (i in 1..10){
//
//         if (i%2==0){
//             println("even num : $i")
//         }else if (i%2!=0){
//
//             println("Odd num : $i")
//         }else{
//             println("num not asign")
//         }
//         println("num $i");
//     }




}



Kotlin For Loop Programming
1.	For keyword thakbe. Then parent thisis.
2.	i er akta counter value tahkbe.. but intilize korar projon nei
3.	in operator thakbe condition hesabe kaj kore.
4.	akta range thakbe
5.	compiler automatically i er valuti 0 hishabe nai.
6.	ami step keyword er maddhome akta loop er step ta bole dite parbo.
7.	


Whiel and Do While Loop in Kotlin

1.	For loop use kori amder range ta janar jonno. Amder loop ta koto bar chelate hobe.

2.	While loop use kori ejonno amder loop ta ojana othat amra jaina amder loop ta kootbar chalate hobe. Kono na kono condition er upor virti kore loop ta stop hoye jabe otherwise amder loop ta choltei thakbe.

3.	
Int i = 0 //counter variable intilize.
While(condition){
Statement ;
i++;
}
# While loop ter cndtion er upor virti kore loop ta cholbe abar condition false hoel cholbena..

# while looper purbei sobsomoy counter variable ti intilize korte hoy.

# counter variable and condition er man jotokhon porjonoto true hobe totokhon porjonto choltei thakbe.
Amder body er vitore statement gulo execute hobe.

# whiel loop er body sese and closing bracket er age then  statement r o pore amder counter variable ti update korte hobe.  i++; 
ta na hole amder loop ti choltei thakbe.



Compiler a whiel loop  kivabe kajkore.

# while loop condtiton check korbe

# erpor body er vitore dukhbe and statement gulo excute korbe

# counter variable er value ta update korbe.

# abar whiel loop a back jabe and condition check korbe . condition Jodi true hoy tahole se kaj korbe r Jodi condition Jodi false hoy loop ta kaj korbena terminate hoye jabe.

Do While Loop

# do while loop r whiel loop er moddhe sudu mattro aktai thopat.

# do while loop must be 1 bar execute hobei condition true hook ban a hook  condition er moddhe akbar statement gulo execute hobei. Ohtat se akbarer jonoo holeo print korbei. 


#  counter variable i=0;
do{
 Statement ();
i++;        
}( condition );

# compiler fast do er  body er vitore dukhbe and statement gulo excute hobe.

# erpor condition check korbe condition Jodi true hoy tahole abar do er starting a back jabe r Jodi mittha hoy tahole ekheanei loop ta terminate hoye jabe.


Kotlin Array:-
1.	Array akti data sturucter . jeta onek gulo data aksate dhore rakhte pare. Tobe data gulo akoi typer hoto hobe.

2.	Array akoi sathe onek gulo data dharon kore rakhte pare. Koto gulo data dharon korbe seta amkei bole dite hobe.

3.	Onek datastucture implement korar jonno array use kora hoy.

 
4.	Array make korar jono Kotlin a sundhor akta function ase ArrayOfFunction();

5.	Kotlin a Array make korar jonno [] dearor projojn nei eta onek shoz.

6.	Array print 
var array  = arrayOf(12,2,3,4,8)

for (i in array){

    println("Array of $i")
}

7.	Value na diyeo kaj kora jai array te.:

8.	+ function er maddhome amara notun value array te input korte pari.

9.	Kotlin a int a value er jonno intArrayOf, floatArrayOf, longArrayOf.

10.	Kotlin a length bole kisui nai ekhane just arra.size use korte hobe.

Kotlin: Lecture 18(B) Mostly Used Array Functions Bangla | Learn How to Use
 Kotlin Array Basic Functions

1.	  Fill function – fiil function muloto array te fill function kajer jonno use kora hoy.

2.	  Var array = arrayOf(1,2,3,45,6,7);

3.	 Array.fill(-1)

4.	 Jokon program excute hobe tokon array ta fill hobe -1 dara. Tokon ager j 1,2,3,4,45,6,7 ei value gulo thakbena sobgulo terminate hoye -1 hoye jabe.

5.	 Print korte hobe..
 Array.foreach{print(“$ it”)}

6.	Jokon amder array ta nirdisto kono value ke fill korar dorker hobe tokon amara ei function ta kaje lagate parboo.

7.	Reverse function ta amder array take 0 index a sajaye dai.  0 index a jeta ase seata last index a jabe , fast index a jeta ase seta last index a jabe.

8.	 Arr.reverse()
Res.foreach{print(“array of rev : $it , ”)}

9.	 Reversed array () fuction ta use korle amder orginal array er kono probotton hobena.

10.	Arr.sort() – sort er method dara amra prothomoto soto soto num theke boro num a jai.

11.	Arr.sortDescending() – ei method er maddhome amara boro thkee soto num a jaboo..

12.	Arr.sliceArray() – ei array te index gulo bole dite hobe kotota index ase suppose var arr = res.sliceArray(2..4)

Ermane 2 no index theke 4 no index projontoo call korte saisi.

       					Example: 
							of Array….

package FebruaryKOTLIN

fun main(args:Array<String>){



    // origianl array and reversed arry of..

    var res = arrayOf(1,2,3,4,845,45,48);



     var array2 = res.sliceArray(2..4)
     println("array slice: - ")
     array2.forEach { print("$it ,") }
    println("\n")



    var arr = res.reversedArray();

    var s = res.sortedArray();
     res.sortDescending();


    println("Array of : ")
    res.forEach { print("  $it  ,") }
    println("\n")

    println("Array of Reversed: ")
    arr.forEach { print(" $it , ") }
    println("\n")

    println("Sort Array of : ")
    s.forEach { print(" $it , ") }
    println("\n")

    println("SortDescending Array of : ")
       res.forEach { print("$it ") }
}



 
Example
1.	Fast array of:- 
# fastly value diye ei array er kaj gulo korte hoy.

var arr = arrayOf(10,20,30,40,50);

for (i in arr){

     println("$i")
}




2.	Second array of:-
# value na diyeo kaj korar akta way ase.

#  int arrayOf nibo jer vitore kono value assign korbona.

#next value assign korar jonno amar akta function er help nite hobe. Seta hose plus function. Notun array ta appeand kore new array ta return kore.

package FebruaryKOTLIN

fun main(args:Array<String>){


    var arr = intArrayOf();

    for (i in 1..5){

        arr = arr.plus(i*i); // every num multiply


    }

     //value print
    arr.forEach { println("$it") }

}



3.	Object creation of Array:-
#fast object
#second dataType end.
#parent thisis() and include 2 argument - 1. Size. 2.functin lateral, kono na kono kisu through korte hobe.
# je man dibo like 1,5 se man dara fillup hoye jabe..

Example:-
fun main(args:Array<String>){


  var array = Array<Int>(5,{1})

    array.forEach { print("$it") }

}



5.when expression array:-
package FebruaryKOTLIN

fun main(args:Array<String>){


   var array = Array<String>(10,{


       when{

           it%2==0 -> "Yes; "
           else -> ", No"
       }

   })

    array.forEach { print("$it") }

}

4.	Array fill :-
# array fill ei function ta call korle , j value dara call korbo sei value dara fill hoy jabe array te..
Ex: 10,2,5,8,6,9,4 – sobgulo array te -1 hobe..
5.	var array = arrayOf(10,2,5,8,6,9,4)

 array.fill(-1);

 array.forEach { print("$it") }

5.Array Reverse(); 
# reverse fun ta array ke 0 index a sajiye dai, jeta fast index a ase seta last index a . jeta last index a ase seta fast index a …

Exm:
 package FebruaryKOTLIN

fun main(args:Array<String>){



  var array = arrayOf(10,2,5,4,6,4);

    array.reverse();

    array.forEach { print(" ,$it") }



}



6.New array still then reverse aray print and ei aray akti array return kore.

#orginal array change hobena.
package FebruaryKOTLIN

fun main(args:Array<String>){



  var array = arrayOf(10,20,30,45,47)

    var ar = array.reversedArray()

    print("Array of : ")
    array.forEach { print(",$it") }

    println()
    print("Reversed arry or :-")
    ar.forEach { print(",$it") }





}



6.	sort() of array:-
      # small num theke big num a jabe..
Example: -
package FebruaryKOTLIN

fun main(args:Array<String>){


 var array = arrayOf(10,2,4,5,8,7,1);
    array.sort()

    array.forEach { print(",$it") }



}

7.	big num theke small num:-
#sortDescending;
8.	package FebruaryKOTLIN

fun main(args:Array<String>){


 var array = arrayOf(10,2,4,5,8,7,1);
    array.sortDescending()

    array.forEach { print(",$it") }


}
8.Slice array();
#akta array er moddhe ba nirdisto kisu length er projon hoy tahole amara slice function ta use korte parbo.
Example:- 
package FebruaryKOTLIN

fun main(args:Array<String>){


 var array  = arrayOf(10,2,4,5,6)

    var arr = array.sliceArray(2..4)


    array.forEach { print("$it") }

    println()
    arr.forEach { print("$it") }




}











Basic Concepts of 2D Array

1.	Matrix niye kaj korte hole sure jeta projon seta holo 2 dimontional aray.

2.	Major , major topics advanced topics jamon graph, implements korte 2D array use kora hoy. Daynamic program, mactract , riddi, esob algoritham implement korar jonno amder array projon hoy.

3.	J variable er vitore Array rakhlam seta holo amder row. R j variable vitore amder Array er index rakhlam seta holo amder column.

4.	 


5.	 



6.	  




-:How to Declare Two Dimensional
Array in Kotlin:-


1.	Array of function and array of object use kore amara array dimensional create korte pari. 2d array implement korte pari..

2.	
Example: package udacity

fun main(args: Array<String>) {


    var row1 = arrayOf(1, 2, 3)
    var row2 = arrayOf(4,5,6);
    var row3 = arrayOf(7,8,9);

    var array = arrayOf(row1,row2,row3);

    for (i in array){

        for (j in i){

            print("$j")
        }

        println(" ");
    }
}

3.	Example: - 
4.	
 var array = Array(3, {IntArray(3,{-1 })})

for (i in array){

    for (j in i){

        print("$j")
    }
    println(" ")
}


5.	 User Input Array Print:--

Indices – array index ta assign hobe..

Example: package udacity

fun main(args: Array<String>) {


     print("Enter your data : ")

      var array  = Array(3,{IntArray(3,{-1})})

      // fast array 3-row, second array 3 column , -1  row column a boshbe.


     for (i in array.indices){

         for (j in array[i].indices){

             array[i][j] = Integer.parseInt(readLine())

         }
     }

    for (i in array){

        for (j in i){

            print("$j , ")
        }

        println(" ")
    }




}

-:String in Kotlin Bangla:-


1.	 String holo immutable object.

2.	 String that’s means – don;’t changing , Aporibortonio. Poriborton kora jaina.


3.	String  reference initialize to don’t change.

4.	String 02 vabe declear kora jai – akta holo double cotation er moddhe r akta holo threepol cotation er moddhe ..

5.	Double cotation er moddhe Jodi kono scape sequyence kori tahole seta \n \t eisob.  


6.	String change korte pari but String er ref  change korte parina..

7.	 Double cottaion er String declear kori tahole amar scape sequyence er ja ja ase sobi kaj korbe jamon \t,\n etcl

8.	Threepol cottaion er String declear kori tahole amar scype sequence gulo akoi sathe kaj na kore akoi sathe print korbee..

9.	 Length 
Kotlin function
How to declare function


1.	 Fun create korar jonno  -  fun keyword.

2.	 Fun er akta name  - isSome j name ta best


3.	Name er pore – () parent thisis.

4.	Parent thisis er vitore – argument rakhbo.


5.	Argument na thakle akta faka parent thisis.

6.	Argument er moddhe akta n:Int -  fastly akta name erpor clone and type taoo amake bole dite hobe..
7.	Aker odhik argument thakle  , dile argument gulo k separate korte hobe.

8.	 Parent thisis er pore akta clone diye function ta kon typer er data retun korbe setao bole dite hobe..


9.	Return type declear koro pore akta open curly bracket use korte hobe. Eta function er static k start kore dai.

 Example:   package FebruaryKOTLIN

fun main (args:Array<String>){

      println(isMath(18,3))

}

 fun isMath(n:Int, m:Int):Boolean 
         = when{

         n%m == 0 -> true
         else  ->  false
     }

-:Null Pointer Exception:-
1. null initialize korar projon hole - ?
2. val name:String? = null;

    // exception throgh hok r setar jonno akta operator ase.

3.    var na:String?  = null

    println(na!!.length)
    /* assert operator.. ei operator amake bole dai
    null hoile exception  through korte hobe*/



Example:  package FebruaryKOTLIN

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






New Kotlin learn: -
Operator
 







 
 
 


Basic concept Array Kotlin
# Array is data stucter of same data type.
# Array many other data to arrange call your say. 
Array: - 




#                   Sometimes  Array  cannot directly assign , next time when I am use to looping array range then I will append to array.plus function. -  that is time I will use plus function.. plus()

# plus function er madhome amara array te new value appeand korte pari. 

# Ei plus function ta notun array return kore.R sei new array ta amra amder variable ba array er moddhe rakhi
# first initialize 1*1 – 2*2  3*3 etc.
 

 
 


 
 
 

 

 


How to work with String
 

 
 

 
 



Function
 

 
 
 



Null safe function
1.	First data null accept korena.
2.	Second data null assign korte parbe.

fun main(args: Array<String>) {

    // safe call is declare to  ?
    // use to question mark and get to null function
    // default vabe somosto datatype a null..
    var name:String? = null
    println(name?.length)




    // smart way to function, safe call to declare.
    var cn:String? = "Muahid vaia"
    if (cn!=null){
        println(cn.length)
    }



    println("\n")

    var nam:String? = null
    var len = nam?.length?: -1
    println(len)



    // working to exception through assert operator !!
    //call to exception through
    var resName: String? = null
    println(resName!!.length)


}




