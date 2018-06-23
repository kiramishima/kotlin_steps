
fun main(args: Array<String>) {
    var x = 1
    when(x) {
        1 -> {
            print("value is 1")
        }
        2 -> {
            print("value is 2")
        }
        3 -> {
            print("value is 3")
        }
        else -> {
            print("value is out of range")
        }
    }

    //
    x = 40
    when(x) {
        1,2 -> {
            print("value is 1 or 2")
        }
        in 10..30 -> {
            print("value is in range 10..30")
        }
        !in 10..30 -> {
            print("value is not in range 10..30")
        }
        else -> {
            print("value is out of range")
        }
    }
}