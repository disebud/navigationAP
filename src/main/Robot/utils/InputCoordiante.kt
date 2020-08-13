package main.Robot.utils

// version 1
fun InputCordinate():Array<Int> {
    println("--- POSISI AWAL ROBOT ---")
    print(" > Input Coordinate x : ")
    var x = readLine()!!.toInt()
    print(" > Input Coordinate y : ")
    var y = readLine()!!.toInt()
    val coordinate = arrayOf(x,y)
    println(" > Posisi Awal Robot pada Kordinat : "+ coordinate.joinToString())
    println("--- --- --- --- --- --- --- --- --- --- ---")
    return coordinate
}

// version 2
fun InputCordinate1():List<String>{
    println("--- POSISI AWAL ROBOT ---")
    print(" > Posisi Awal Robot pada Kordinat : ")
    var antena = readLine() // penampung inputan string coordinate
    val coordinate1 = antena!!.split(",") // kemudian di split / di pisahkan dengan koma
    println("--- --- --- --- --- --- --- --- --- --- ---")
    return coordinate1
}

//    print(" > Posisi Awal Robot pada Kordinat : ")
//    var antena = readLine() // penampung inputan string coordinate
//    val coordinate = antena!!.split(",") // kemudian di split / di pisahkan dengan koma
//    var robot = Robot(coordinate[0].toInt(), coordinate[1].toInt())

