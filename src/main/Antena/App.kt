package main.Antena

fun main() {
    print("Masukkan Jumlah Antena : ")
    var jumlahAntena = readLine()!!.toInt()  // Input jumlah antena ,Convert ke Int
    var totalAntena = mutableListOf<Coordinate>() // penampung kosong yang bertipe class yang mutable agar bisa di add
    for (i in 1..jumlahAntena) { // looping sebanyak inoutan jumlah antena
        print("Masukkan koordinat antena ke $i : ") // cetakan
        var antena = readLine() // penampung inputan string coordinate
        val coordinateAntena = antena!!.split(",") // kemudian di split / di pisahkan dengan koma
        totalAntena.add(Coordinate(coordinateAntena[0].toInt(), coordinateAntena[1].toInt())) // setelah dipisahkan menjadi array yg nilainya di add kedalam penampung
    // ex: totalAntena = [(2,3),(4,2),(4,4)]
    }
    var result = setOf<Coordinate>() // penampung hasil yg menggunakan set / himpunan agar bisa melakukan irisan
    //
    for (i in 0 until totalAntena.size-1) { // looping element i dimulai dari 0 sampai sejumlah banyak himpunan data
        for(j in i+1 until totalAntena.size){ // looping element j dimulai dari i+1 sampai sejumlah banyak himpunan data
            result += totalAntena[i].coordinateArea().intersect(totalAntena[j].coordinateArea())
            // result = result + totalAntena[0].intersect(totalAntena[1] -> (2,3) , (4,2)
            // result = result + totalAntena[0].intersect(totalAntena[2] -> (2,3) , (4,4)
            // result = result + totalAntena[1].intersect(totalAntena[2] -> (4,2) , (4,4)
            println("------------------------------------------------------------------------------------------")
            println("Hasil Intersect Area Antena ${i+1} = ${totalAntena[i]} & Antena ${j+1} = ${totalAntena[j]} = $result")
            println("------------------------------------------------------------------------------------------")

        }
    }
    println("Hasil Intersect terakhir $result")
    println("------------------------------------------------------------------------------------------")
}

data class Coordinate(var x: Int, var y: Int) {

    override fun toString(): String {
        return "($x, $y)"
    }

    fun coordinateArea(): MutableList<Coordinate> {
        var getArea = mutableListOf<Coordinate>()
        // x = 2 , y = 3
        for (i in x - 1..x + 1) { // i nya -> 2-1 = 1 sampai 2+1 = 3  -> ( 1 , 2 , 3 )
            for (j in y - 1..y + 1) { // y nya -> 3-1 = 2 sampai 3+1 = 4 -> ( 2 , 3 , 4 )
                getArea.add(Coordinate(i, j))
                // menambahkan
                // x = 1 -> 1,2 , 1,3 , 1,4
                // x = 2 -> 2,2 , 2,3 , 2,4
                // x = 3 -> 3,2 , 3,3 , 3,4
                println(getArea)
            }
        }

        return getArea
    }

}

//
//fun main(){
//    val formations = mutableListOf<Coordinate>()
//    print("Input jumlah antenna :")
//    var sumAntenna = readLine()!!.toInt()
//    for (i in 1..sumAntenna){
//        println("Kordinat antenna ke-$i:")
//        print("sumbuh x =")
//        val x = readLine()!!.toInt()
//        print("sumbuh y =")
//        val y = readLine()!!.toInt()
//        formations.add(Coordinate(x, y))
//    }
//
//    var hasilArea = setOf<Coordinate>()
//    for (i in 0 until formations.size ) {
//        for (j in i+1 until formations.size) {
//            println(formations[i].coordinateArea())
//            hasilArea += formations[i].coordinateArea().intersect(formations[j].coordinateArea())
//        }
//    }
//    println(hasilArea)
//
//}
//
//data class Coordinate(var x:Int, var y: Int){
//
//    override fun toString(): String {
//        return "($x, $y)"
//    }
//
//    fun coordinateArea(): MutableSet<Coordinate> {
//        var getArea = mutableSetOf<Coordinate>()
//        for (i in x-1..x+1){
//            for(j in y-1..y+1){
//                getArea.add(Coordinate(i, j))
//            }
//        }
//        return getArea
//    }
//
//
//}