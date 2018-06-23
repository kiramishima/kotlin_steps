fun main(args: Array<String>){
    print("Enter the number: ")
    var x = readLine()!!.toInt()
    when(x) {
        x%2 -> println("the number is even")
        else -> println("the number is odd")
    }
}