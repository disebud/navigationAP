package main.pertemuan3

fun main(){
//    val rectangle = Rectangle(7.0, 8.0)
//    printInfo(rectangle)

    val rectangle = Rectangle(7.0,8.0)
    val circle = Circle(9.0)
    val square = Square(8.0)

    val shapes : Array<TwoDimensionalShape> = arrayOf(rectangle, circle, square )
//    printInfo(rectangle)
//    printInfo(circle)
//    printInfo(square)
    sumArea(shapes)
}

fun sumArea(shapes:Array<TwoDimensionalShape>){
//    print("Total SUM AREA: "+shapes[0].getArea()+shapes[1].getArea()+shapes[2].getArea())
    var total : Double = 0.0
    for (shape in shapes){
        println("Area = ${shape.getArea()}")
        total += shape.getArea()
    }
    println("Total area $total")
}

fun printInfo(twoDimensionalShape: TwoDimensionalShape) {
    println("----- Polymorphism -----")
    println("Area: ${twoDimensionalShape.getArea()}")
    println("Circumference : ${twoDimensionalShape.getCircumference()}")
}