package main.pertemuan2


fun main() {
//val field = Rectangle(4.0, 3.0)
//    print(field.getInfo())
//val aquarium = Block(7.0)
//    aquarium.length = 7.0
//    aquarium.width=4.0
//    println(aquarium.getInfo())
//    println(aquarium.width)
//    println(aquarium.height)
}

open class Rectangle(var length: Double = 0.0, var width: Double = 0.0) {
    fun getCircumference(): Double {
        return 2*length+2*width
    }

    fun getArea(): Double {
        return length*width
    }

    fun getInfo(): String {
        return "main.Rectangle(length=$length, width=$width, arround=${getCircumference()} , area=${getArea()}),"
    }
}

class Block(var height: Double) : Rectangle(){
    fun panggilParent(){
        getInfo()
    }
}

//class main.Block(length:Double, width:Double,var height:Double):main.Rectangle(length,width)


fun OOP1(){
//    val myBlueRush = Car()
//    printInfo(myBlueRush)
}

//private fun printInfo(myCar: Car) {
//    println(myCar)
//    println("MyBlueCar is a ${myCar.name}, with color ${myCar.color}")
//}



fun OOP2 (){
    val captainAmerica: Hero = Hero("Captain America", 100, 20)
    val ironMan: Hero = Hero("Iron Man", 200, 15)
    captainAmerica.attack(ironMan)



}

fun variable() {
    var oka = "Disebud"
    println(oka)
    oka = "Yeah"
    println(oka)
//////////////////////////////////////
    print("Input Nama:")
    val name= readLine()
    println("Nama yang diinput $name")
    print("Input Umur:")
//    val age = readLine()?.toInt()
//    println(age?.minus(3))
    val age = readLine()
    println(age?.toInt()?.minus(3))
    /////////////
    print("Input waktu pengumpulan : ")
//    val inputText = readLine()
    val submission = readLine()!!.toInt()
    if (submission >= 8 && submission <= 17) {
        println ("$submission is succes")
    } else {
        println ("$submission is failed")
    }
    /////////////////////////

    var x : Int = 13

    when{
        x in 3..7 -> println("it's is in 3 until 7")
        (x == 9 || x == 11) -> println("it's 9 or 11")
        x is Int -> println("it's a Int")
        x==13 -> println("lucky number")
        x>20 -> println("")
        else -> println(x)
    }

    //////////////////
//    var numbers2 = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12)
//    for(element in numbers2){
//        if(element%3==0){
//            println(element*2)
//        } else {
//            println(element)
//        }
//    }
//    //////
//    var numbers = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12)
//    for(element in numbers){
//        if(element%3==0){
//            println(element*2)
//        } else {
//            println(element)
//        }
//    }



}

fun array(){
    var numbers1 : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12)
    numbers1 = arrayOf(4,5,2,1,5,0,2,1)
    numbers1[5]=7
    println(numbers1.joinToString())
}

fun bamboo(){
    print("^ Masukan jumlah main.bamboo: ")
    val jmlBamboo = readLine()
    var result = arrayOfNulls<Int>(0)
    for (i in 1..jmlBamboo!!.toInt()){
        print("> Panjang main.bamboo ke-$i: ")
        val panjangBamboo = readLine()!!.toInt()
        result += panjangBamboo

    }
    print("^ Input jumlah cycle : ")
    val jmlCycle= readLine()!!.toInt()
    for (a in 0..jmlCycle){
        if ("cycle ke-$a:"=="cycle ke-0"){
            println(">initial : ")
        }else{
            println(">cycle ke $a")
        }
        for (b in result.indices){
            if (result[b] == 0 ) continue
            for (c in 1..result[b]!!){
                print("- ")
            }
            println()
            result[b]=result[b]!!-1
        }
    }

}

fun Bamboo2(){
    //    var Bamboo :Array<Int> = arrayOf()
//    print("^ Masukan jumlah main.bamboo: ")
//    val jmlBamboo = readLine()
//    for (i in 1..jmlBamboo!!.toInt()){
//        print("> Panjang Bamboo ke-$i:")
//        val masuk = readLine()
//        Bamboo.plusElement(masuk).joinToString()
//    }
//    print("^ Masukan jumlah Cycle: ")
//    val jmlCycle = readLine()
    println("[CHALLENGE - 8.1] Cut The Bamboo")
    print("^ Input Jumlah Bamboo: ")
    val InputjmlBamboo = readLine()
    var DataJmlBamboo: Array<Int> = arrayOf()
    for(i in 1..InputjmlBamboo?.toInt()!!) {
        print("> Panjang main.bamboo ke-$i : ")
        val InputPanjang = readLine()!!.toInt()
        DataJmlBamboo = DataJmlBamboo + InputPanjang
    }

    print("^ Input jumlah cycle : ")
    var jmlCycle = readLine()!!.toInt()
    for(item in 0..jmlCycle) {
        var printResult = if ("Cycle ke $item: " == "Cycle ke 0: ") ">Initial :" else ">Cycle ke $item: "
        println(printResult)
        for(item2 in DataJmlBamboo.indices) {
            if (DataJmlBamboo[item2] == 0) continue
            for (item3 in 1..DataJmlBamboo[item2]!!) print("- ")
            println()
            DataJmlBamboo[item2] = DataJmlBamboo[item2]?.minus(1)

        }
    }
}