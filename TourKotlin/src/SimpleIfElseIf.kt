
fun main(args: Array<String>){
    // input
    print("Enter your grade:")
    var grade = readLine()!!.toDouble()
    // process
    if (grade >= 90) {
        // block of code
        grade = grade + 3
        println("You are in A level")
    } else if (grade >= 80 && grade < 90) {
        // block of code
        println("You are in B level")
    } else if (grade >= 70 && grade < 80) {
        // block of code
        println("You are in C level")
    } else {
        println("You Fail")
    }

    print("Your enter grade $grade")
    // output
}