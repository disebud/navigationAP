package main

import main.entity.Robot
import main.utils.InputCordinate
import main.utils.InputPerintah

fun main(){
    var coordinate = InputCordinate()
    var robot = Robot(coordinate.first(), coordinate.last())
    robot.PerintahProses(InputPerintah())

}


