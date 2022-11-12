fun main(args: Array<String>) {
    //number1
    val age1:Int = 42
    val age2:Int = 21
/*----------------------------------------------*/
    //number2-3
    val avg1:Int = (age1+age2)/2
/*----------------------------------------------*/
    //number4
    val firstName:String = "Ivan"
    val lastName:String = "Konyshev"
/*----------------------------------------------*/
    //number5
    val fullName:String = firstName+lastName
/*----------------------------------------------*/
    //number6
    val myDetails = "Hello, my name is $fullName"
/*----------------------------------------------*/
    //number7
    val trip=Triple(9,13,2004)
/*----------------------------------------------*/
    //number8
    val (month:Int,day:Int,year:Int) = trip
/*----------------------------------------------*/
    //number9
    print("month: $month, year: $year.")
/*----------------------------------------------*/

}