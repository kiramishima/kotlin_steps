fun main(args: Array<String>){
    var count = 1 //6
    do {
        println("Enter the loop")
        // block of code
        if (count == 2) {
            println("count: $count")
        }
        count++
    } while(count <= 5)
    println("Loop done")
}