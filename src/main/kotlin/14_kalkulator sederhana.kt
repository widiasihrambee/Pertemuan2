fun main() {
    println("selamat datang di kalkulator kami")
    println("masukkan angka pertama:")
    val a = readLine()!!.toDouble()
    println("masukkan Angka kedua:");
    val b = readLine()!!.toDouble()
    println("Pilih salah satu dari operasi berikut:")
    println("1 - addition")
    println("2 - subtraction")
    println("3 - multiplication")
    println("4 - division")
    val choice = readLine()!!.toInt()
    var result = 0.0
    if (choice == 1) {
        result = a + b

    } else if (choice == 2) {
        result = a - b
    } else if (choice == 3) {
        result = a * b
    } else if (choice == 4) {
        result = a / b
    }
    if ((choice > 0) && (choice < 5)) {
        println("result: $result")
    } else {
        println("Pilihan tidak valid")
    }
    println("Terima kasih telah menggunakan kalkulator kami.")
}