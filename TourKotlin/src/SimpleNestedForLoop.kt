
fun main(args: Array<String>){
    for(count1 in 1..10)
    {
        // block of code
        println("count1: $count1")
        for(count2 in 1..7) {
            println("count2: $count2")
        }
        println("Loop nested done")
    }
    println("Loop done")
}