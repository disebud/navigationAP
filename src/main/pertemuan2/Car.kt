package main.pertemuan2

//fun main() {
//    val myBlueRush = Cars("Blue", "Rush", "Toyota")
//
//    //kalo fun dalam class, cara print nya jadi gini
//    myBlueRush.printInfo()
//}


class Cars(Color: String, name:String, brand:String) {
    var color: String = Color
    var name: String = name
    var brand: String = brand

    //memindahkan fun kesini
    fun printInfo() {
        println(this)
        println("MyBlueCar is a ${this.brand} ${this.color}, with color ${this.color}")
    }
}