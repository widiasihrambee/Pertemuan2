fun main() {
    //Map<K, v> is not inheritor of the collection interface;
    /*
    map stores key-value pairs (or enteris)
    keys are unique, but different keys can be paired with equal values.
    */
    val numbersMap = mapOf("key1" to 1, "key2" to 2,"key3" to 3, "key4" to 1)
    println("All keys : ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value bu key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous

    //we maps containing the equal pairs are equal regardies of the pair their
    val mutableMap = mutableMapOf("one" to 1, "two" to 2)
    mutableMap.put("three", 3)
    mutableMap["one"] = 11
    println(mutableMap)
    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"]) // prints "1"
}
