// This main function
fun main(args: Array<String>){
    // Enter user name
    println("Enter name:")
    var name = readLine()
    println("Enter age:")
    var age:Int = readLine()!!.toInt()
    println("Enter department::")
    var dep: String?
    dep = readLine()
    println("Enter pi:")
    var pi: Double = readLine()!!.toDouble()

    /* print output
    to allow users to see th variables values
     */
    println("**** output ****")
    println("name: " + name)
    println("age: " + age)
    println("department $dep")
    println("PI: " + pi)
}