fun main(args: Array<String>) {

    var n1: Int = 1
    var n2: Int?
    var n2Str:String = "12"
    n2 = n2Str.toInt()
    var n2Float: Float ?
    n2Float = n2Str.toFloat()
    print("n1: $n1")
    println("n2: $n2")
    println("n2Float: $n2Float")

    var xpi: Double = 3.14
    println("pi: $xpi")
    var IntPi: Int = xpi.toInt()
    println("IntPi: ${IntPi.toString()}")
}