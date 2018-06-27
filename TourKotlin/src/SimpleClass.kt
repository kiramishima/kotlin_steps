
class Car(var type: String, var model: Int, var price: Double, var milesDrive: Int, var owner: String){
    // init {
        // println("Class is created")
        // println("type: $type")
        // println("model: $model")
        // println("price: $price")
        // println("milesDrive: $milesDrive")
        // println("owner: $owner")
    // }

    fun getCarPrice(): Double {
        return this.price - (this.milesDrive.toDouble() * 10)
    }
}

fun main(args: Array<String>){
    val huCar = Car("BMW", 2015, 10000.0, 105, "Kira Mishima")
    println("huCar: ${huCar.getCarPrice()}")
    val jeCar = Car("KA", 2017, 2000.0,  1, "Kura Mishima")
    println("jeCar: ${jeCar.getCarPrice()}")
}