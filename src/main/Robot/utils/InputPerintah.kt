package main.Robot.utils

fun InputPerintah():String {
    print("Input Perintah : ")
    val perintah = readLine()!!.toUpperCase()
    println(" > Perintah Robot : "+ perintah)
    return perintah
}
