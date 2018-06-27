var fullName = "Kira Mishima" // global var
fun display(): Unit {
    println("fullName: $fullName")
}
fun main(args: Array<String>){
    var name = "Kira" // local var
    println(fullName)
    println("name: $name")
    display()
}