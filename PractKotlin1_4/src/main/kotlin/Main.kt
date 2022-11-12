import java.math.BigInteger

    //number1
fun  printFullName(firstName: String, lastName: String) {
    println(firstName +" "+ lastName)
}
    //number3
fun calcuteFullname() {
        val returnString: Unit = printFullName("Egor", "Letov")
        return returnString
}
//number5
 fun simpleValue(){
     val integer = 12311
     val bigInteger = BigInteger.valueOf(integer.toLong())
     val probablePrime = bigInteger.isProbablePrime(Math.log(integer.toDouble()).toInt())
     println(probablePrime)
 }
fun fibonacchi() {
    val n = 10
    var t1 = 0
    var t2 = 1

    print("First $n terms: ")

    for (i in 1..n) {
        print("$t1 + ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}
    //number2
fun main(args: Array<String>) {
 // printFullName("Egor", "Letov")
        calcuteFullname()
        simpleValue()
        fibonacchi()
}