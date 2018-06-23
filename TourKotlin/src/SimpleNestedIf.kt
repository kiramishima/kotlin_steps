
fun main(args: Array<String>){
    // input
    print("Enter your grade:")
    var grade = readLine()!!.toDouble()
    // process
    if (grade >= 90) {
        // block of code
        grade = grade + 3
        if (grade < 93) {
            println("You are in A- level")
        } else {
            println("You are in A+ level")
        }
    }
    // output
    print("Your enter grade $grade")
}