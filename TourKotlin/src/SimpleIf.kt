import java.util.*

fun main(args: Array<String>){
    // input
    print("Enter your grade:")
    var grade = readLine()!!.toDouble()
    // process
    if (grade >= 90) {
        // block of code
        grade = grade + 3
        println("You are in A level")
    }

    if (grade >= 50 && grade <= 70) {
        grade += 10
        print("You get extra 10 points")
    }
    print("Your enter grade $grade")
    // output
}