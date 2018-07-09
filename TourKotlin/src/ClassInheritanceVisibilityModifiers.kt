open class OperationsVM() {
    public var ProcessName: String? = null
    //protected var ProcessName: String? = null
    //private var ProcessName: String? = null
    fun sum(n1: Int, n2: Int): Int{
        return n1 + n2
    }
    fun div(n1: Int, n2: Int): Int{
        return n1 / n2
    }
}

class MultiOperationsVM(): OperationsVM() {
    fun sub(n1: Int, n2: Int): Int{
        return n1 - n2
    }
    fun mul(n1: Int, n2: Int): Int{
        return n1 * n2
    }
    fun GetName(){
        super.ProcessName
    }
}

fun main(args: Array<String>){
    var op = OperationsVM()
    var sum = op.sum(10, 15)
    println("sum: $sum")
    var div = op.div(12, 11)
    println("div: $div")

    println("op.ProcessName ${op.ProcessName}")

    // second
    var op2 = MultiOperationsVM()
    sum = op2.sum(10, 15)
    println("sum: $sum")
    div = op2.div(12, 11)
    println("div: $div")
}