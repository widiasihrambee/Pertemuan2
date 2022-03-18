fun main() {
    // Create on array<String> with sizes $ and volues ["0","1","4","9","16"]

    val asc = Array(5){
        i -> (i * i ).toString()
    }
    asc.forEach { println(it) }
}