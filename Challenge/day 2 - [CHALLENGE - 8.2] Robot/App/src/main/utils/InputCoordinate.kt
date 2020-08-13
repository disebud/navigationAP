package main.utils

fun InputCordinate():Array<Int> {
    println("--- POSISI AWAL ROBOT ---")
    print(" > Input Coordinate x : ")
    var x = readLine()!!.toInt()
    print(" > Input Coordinate y : ")
    var y = readLine()!!.toInt()
    val coordinate = arrayOf(x,y)
    println(" > Posisi Awal Robot pada Kordinat : "+ coordinate.joinToString())
    println("--- --- --- --- --- --- --- --- --- ---")
    return coordinate
}

