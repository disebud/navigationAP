package main.Students

import main.Students.entity.Student

fun main(){

    val maul= Student ("Maul",22,"M")
    val Yuni= Student ("Yuni",23,"F")
    val Angga= Student ("Angga",23,"M")

    val studentList = mutableListOf<Student>()

    studentList.add(maul)
    studentList.add(Yuni)
    studentList.add(Angga)

    println(studentList.joinToString())

    // satu memory
    val wanted1 = maul
    //beda alamat memory
    val wanted = Student ("Maul",22,"M")

    // True mencari karakteristik yang sama dengan wanted karena di class ada equals , klo tidak ada makan akan true
    println(studentList.contains(wanted))

    println(maul.equals(wanted))
    println(maul!=wanted)

}