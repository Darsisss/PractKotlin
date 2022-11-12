import java.util.*
import kotlin.math.sqrt


fun main(args: Array<String>) {

    //Зд.1
    println("\tnumber1")
    val myAge: Int = 18
    val isTeenager:Boolean = 13 <= myAge && myAge <= 19
    println(isTeenager)
            println("****************************************************************************")

    //Зд.2
    println("\tnumber2")
    val theirAge:Int = 30
    val bothTeenagers:Boolean =  myAge in 13..19 &&  theirAge in 13..19
    println(bothTeenagers)
          println("****************************************************************************")

    //Зд.3
    println("\tnumber3")
    val reader:String = "SerGay Mihalkov"
    val author:String = "Richard Lucas"
    val authorIsReader = reader == author
    println(authorIsReader)
          println("****************************************************************************")

    //Зд.4
    println("\tnumber4")
    val readerBeforeAuthor = author > reader
    println(readerBeforeAuthor)
         println("****************************************************************************")

    //Зд.5
    println("\tnumber5")
    val myAge2: Int = 18
    if (myAge2 in 13..19)
    {
        println("Nastolatek")//русский язык не работает, пишем на польском(translate: "Подросток")
    } else
        println("nie Nastolatek")//translate: "не Подросток"
         println("****************************************************************************")

    //Зд.6
    println("\tnumber6")
    val answer = if ( myAge2 in 13..19 ) println ("Nastolatek") else println("nie Nastolatek")
        println(answer)
         println("****************************************************************************")

    //Зд.7
    println("\tnumber7")
    var counter:Int = 0
    while (counter < 10)
    {
        var x:Int = counter
        counter++
        println(x)
    }
         println("****************************************************************************")

    //Зд.8
    println("\tnumber8")
    var roll:Int = 0
    do {
        roll = Random().nextInt(6)
        counter++
        println("After $counter rolls, roll equally $roll")
    } while (counter < 0)
            println("****************************************************************************")

    //Зд.9
    println("\tnumber9")
    val range = Random().nextInt(10)
    val count = 10
    var Sum:Int = 0
    for (range in range..count) {
        println("range =$range")
        Sum = range*range
        println(Sum)
    }
         println("****************************************************************************")

    //Зд.10
    println("\tnumber10")
    val range1 = Random().nextInt(10)
    val count1 = 10
    var Sum1:Double = 0.0

    for (range in range1..count1) {
        println("range =$range1")
        Sum1 = sqrt(range.toDouble())
        println(Sum1)
    }
        println("****************************************************************************")



    //Зд.11
    println("\tnumber11")
    for (row in 1 until 8 step 2) {
        for (column in 0 until 8) {
            Sum += row * column
        }
    }
    println(Sum)
        println("****************************************************************************")

}