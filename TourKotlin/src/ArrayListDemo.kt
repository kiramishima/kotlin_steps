
fun main(args: Array<String>) {
    var arrayList = ArrayList<String>()
    arrayList.add("Trivia")
    arrayList.add("Yelenna")
    arrayList.add("ZulZorander")
    arrayList.add("Gomart")

    println("First name: " + arrayList.get(0))
    arrayList.set(0, "Overflow")
    println("All elements by Object")
    for (item in arrayList) {
        println(item)
    }

    println("All elements by index")
    for (index in 0..arrayList.size-1) {
        println(arrayList.get(index))
    }

    // Search
    if (arrayList.contains("ZulZorander")){
        println("name is found")
    } else {
        println("name is not found")
    }
}