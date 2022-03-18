fun main() {
    //set<T> stores unique elements; their order is generally undefined.

    val numbers = setOf(1,2,3,4)
    println("Numbers of elements: ${numbers. size}")
    if (numbers.contains(1)) println("1 is the set")

    val numbersBackwards = setOf(4,3,2,1)
    println("The sets are equel: ${numbers == numbersBackwards}")

    //The default implemetation of set - LinkedHashSet - preserves the order of elements intruction
    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())

    val string = hashSetOf("a", "b","c","c") //hash set value unik
    println("My set values are ."+string)
}