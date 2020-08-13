package main.Robot

import main.Antena.Coordinate
import main.Robot.entity.Robot
import main.Robot.utils.InputCordinate
import main.Robot.utils.InputCordinate1
import main.Robot.utils.InputPerintah

fun main(){
    // version 1
//    var coordinate = InputCordinate()
//    var robot = Robot(coordinate.first(), coordinate.last())
//    robot.PerintahProses(InputPerintah())

    // version 2
    var coordinate = InputCordinate1()
    var robot = Robot(coordinate[0].toInt(), coordinate[1].toInt())
    robot.PerintahProses(InputPerintah())

}


