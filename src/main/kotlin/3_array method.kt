fun main() {
    //Array methods
    //sort()

    val simpsonsA = arrayOf("homer", "marge","bart","lisa", "meggie")
    simpsonsA.sort()
    for (simpson in simpsonsA){
        print(simpson + ' ')
    }
    print('\n')

    //sorted()
    val simpsonsB: Array<String> = arrayOf("homer","marge","bart","lisa","meggie")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted) {
        print(simpson +' ')
    }
    print('\n')

    //reverse() and reversedArray()
    val simposnsC: Array<String> = arrayOf("homer","marge","brat","lisa","meggie")
    simposnsC.sort()
    simposnsC.reverse()
    for (simpson in simposnsC ){
        print(simpson + ' ')
    }
    print('\n')

    //indexOf()
    val simpsonsD = arrayOf("homer","marge","bart","lisa", "Meggie")
    val simpson = "lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1){
        println("yeah, that's my number ${position + 1 } simpson! ")

    }else {
        println("hey that's not simpson!")
    }

    val simpsonsE = arrayOf("homer","marge","bart","lisa", "Meggie")
    println("Simpsons Size: " + simpsonsE.size)
    if (!simpsonsE.isEmpty())
        println("Array tidak kosong")
    println("Min ="+ simpsonsE.minOrNull())
    println("Max = "+ simpsonsE.maxOrNull())
    println("First = "+ simpsonsE.first())
    println("Last = "+ simpsonsE.last())
    println(simpsonsE.contains("Marge"))

}