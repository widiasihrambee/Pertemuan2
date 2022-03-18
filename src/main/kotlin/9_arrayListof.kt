fun main() {
    //array lists (mutable) bisa diubah
    /*
    method:
    clear(), containts(), size, get(),or [], add() or +=, remove() or -=,
    removeAt(), toTypeArray(),lastIndexof(), removeAll(), reverse()
     */

    val arrayList = arrayListOf(1,2,3)
    print("ArrayList array: ")
    for(item in arrayList){
        print("$item")
        }
    print("\n")
    arrayList += 9

    print("Tambahykan elemen 9 dam arrayList :")
    println(arrayList)

    arrayList.reverse()
    print("Reverse arrayList :")
    println(arrayList)

    arrayList -= 1 // we can delete
    print("Remove last element in arrayList :")
    println(arrayList)

    arrayList += (1..5)
    print("Add range in arrayList :")
    println(arrayList)

}