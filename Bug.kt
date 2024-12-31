fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}

This code is expected to remove even numbers from the list. However,  calling removeIf while iterating can lead to unexpected behavior if you modify the collection during iteration.