import java.util.Calendar

fun main(args: Array<String>) {

    print("Enter Your DOB:")
    var DOB:Int= readLine()!!.toInt()

    var year=Calendar.getInstance().get(Calendar.YEAR)
    var Age:Int?
    Age=year-DOB

    println("Your Age is $Age years")
}