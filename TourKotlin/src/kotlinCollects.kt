
fun main(args: Array<String>) {

    var map = hashMapOf(1 to "Kira", 2 to "Mishima")
    map.put(3, "Kazen")
    println(map.get(3))
    println(map[3])

    var ar = arrayOf(1,10,22,11)
    println(ar[0])

    var list = listOf(11, 22, 33, 22)
    for (item in list){
        println(item)
    }

    var list2 = mutableListOf(11, 22, 33, 22)
    list2[0] = 22
    for (item in list2){
        println(item)
    }
}