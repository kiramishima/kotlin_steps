
fun main(args: Array<String>){
    // input
    print("Enter your grade:")
    var grade = readLine()!!.toDouble()
    // process
    if (grade >= 90) {
        // block of code
        grade = grade + 3
        println("You are in A level")
    } else {
        // block of code
        println("You are not in A level")
    }

    print("Your enter grade $grade")
    // output
}