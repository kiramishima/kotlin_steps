
fun main(args: Array<String>) {
    var title = "Welcome to new york"
    println(title)
    println("title: " + title)
    println("title: $title")
    var name = "Kira " + "Mishima"
    println("name: $name")
    // println("Second Char: $title[1]") // Bad Form
    println("Second Char: " + title[1])
    println("Title: " + title.toLowerCase())
    println("Title: " + title.toUpperCase())
    println("Title: " + title.split(" "))
    println("Title: " + title.trim())
}