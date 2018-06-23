
fun main(args: Array<String>){
    for(count in 1..10)
    {
        // block of code
        if (count == 4) {
            // continue
            break
        }
        println("count: $count")
    }
    println("Loop done")
    for(count in 1..10)
    {
        // block of code
        for(count2 in 1..5) {
            println("count: $count")
            if(count2 == 2){
                break
            }
        }
    }
    // break the loop 1
    loop@ for(count in 1..10)
    {
        // block of code
        for(count2 in 1..5) {
            println("count: $count")
            if(count2 == 2){
                break@loop
            }
        }
    }
}