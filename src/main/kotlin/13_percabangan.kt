fun main() {
    //Conditionans

    if (15 > 5)
        println("True")
    println("The program continius here...")

    //if else
    val a : Int = 5
    val b :Int = 2
    var max: Int

    if (a > b){
        max = a
    }else{
        max = b
    }
    println("Masukkan of a or b is"+ max)

    //if - else if
    var myVar: Int = 0 // the variable is initialized with a value of 0
    if (myVar == 0) { // if the value is 0, we change its value to 1
        myVar = 1
    } else if(myVar == 1){ // if the value is 1, we change its value to 0
        myVar = 0
    } else {
        myVar = -1
    }
    println("Nilai myVar adalah " + myVar)
    print("\nEnter a number : ")
    val intNumber = readLine()!!.toInt()
    if (intNumber > 5)
        println("Angka yang Anda masukkan lebih besar dari 5!")
    println("Thanks for the input!")
}
