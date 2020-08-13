package main.pertemuan3

//TwoDimensionalShape.kt
//--------

open class TwoDimensionalShape {

    open fun getCircumference(): Double {
        return 0.0
    }

    open fun getArea(): Double {
        return 0.0
    }
}


open class Rectangle(var lenght:Double, var width: Double): TwoDimensionalShape() {

    override fun getCircumference():Double{
        return 2*lenght+2*width
    }
    override fun getArea(): Double{
        return lenght*width
    }

}

open class Circle(var radius:Double): TwoDimensionalShape() {

    val phi = 3.14
    override fun getCircumference():Double{
        return phi*(2*radius)
    }
    override fun getArea(): Double{
        return phi*radius*radius
    }

}

open class Square(var side:Double): TwoDimensionalShape() {

    override fun getCircumference():Double{
        return 4*side
    }
    override fun getArea(): Double{
        return side*side
    }

}


