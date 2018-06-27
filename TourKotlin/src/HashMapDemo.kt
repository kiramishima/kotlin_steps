
fun main(args: Array<String>) {
    var map = HashMap<Int, String>()
    map.put(1, "Kira")
    map.put(2, "Mishima")
    map.put(33, "Kazen")
    print(map.get(33))

    map.put(33, "D")
    for (k in map.keys){
        println(map.get(k))
    }
}