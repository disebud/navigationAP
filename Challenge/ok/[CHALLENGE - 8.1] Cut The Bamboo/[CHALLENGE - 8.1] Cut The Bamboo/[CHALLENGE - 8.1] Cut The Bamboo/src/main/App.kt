package main

fun main(){
    bamboo()
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