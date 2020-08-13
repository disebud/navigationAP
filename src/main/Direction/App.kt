package main.Direction

fun main() {
    val direction = Direction()
    println(direction.turnLeft("EAST"))
    println(direction.turnRight("WEST"))
    println(direction.turnLeft("NORTH"))
}

class Direction{
    val directions = arrayOf("North","EAST","SOUTH","WEST")

    fun turnRight(currentDirection : String):String{
        val nextDirection = (directions.indexOf(currentDirection)+1)%4
        return directions[nextDirection]
    }

    fun turnLeft(currentDirection : String):String{
        val nextDirection = (directions.indexOf(currentDirection)+3)%4
        return directions[nextDirection]
    }


}