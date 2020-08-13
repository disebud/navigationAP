package main.setNumber



fun main(){
    val pairs = mutableMapOf<Int,String>()

    pairs.put(1,"January")
    pairs.put(2,"February")
    pairs.put(3,"Maret")
    pairs.put(4,"April")
    pairs.put(5,"Mei")
    pairs.put(1,"Juni")

    for (pair in pairs){
        println("${pair.key}, ${pair.value}")
    }

    println(pairs.get(4))
    println(pairs.containsKey(5))
    println(pairs.containsValue("Juni"))
}

// SET

//val setOfEvenNumber = mutableSetOf<Int>()
//val setOfNumber = mutableSetOf<Int>(1,2,3,4,5,6,3,11)
//
//setOfEvenNumber.add(2)
//setOfEvenNumber.add(4)
//setOfEvenNumber.add(6)
//setOfEvenNumber.add(8)
//setOfEvenNumber.add(10)
//setOfEvenNumber.add(12)
//setOfEvenNumber.add(2)
//
//val intersection = setOfNumber.intersect(setOfEvenNumber)
//val complement = setOfNumber.subtract(setOfEvenNumber)
//
//println(setOfEvenNumber.joinToString())
//println(setOfNumber.joinToString())
//
//println("Irisannya = ${intersection.joinToString()}")
//println("Komplemennya = ${complement.joinToString()}")