/*
Math calculator
 */
fun main(args: Array<String>) {
    println("---- Math calculator ----")
    print("Enter n1:")
    var n1: Float = readLine()!!.toFloat()
    print("Enter n2:")
    var n2: Float = readLine()!!.toFloat()
    var sum: Float?
    sum = n1 + n2
    print("Sum: $sum")
}