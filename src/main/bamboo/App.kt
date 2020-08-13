package main.bamboo

fun main() {
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

