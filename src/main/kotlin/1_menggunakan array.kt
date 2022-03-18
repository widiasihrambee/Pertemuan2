fun main() {
    //Array

    var arrA = arrayOf<Int>()
    arrA += 34
    println(arrA[0])

    var arraB = arrayOf<Int>()
    for (i in 1..10) {
        arraB += i

    }
    for (i in arraB){
        print("$i ")
    }
}