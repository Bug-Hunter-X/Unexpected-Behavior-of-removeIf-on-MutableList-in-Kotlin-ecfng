fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    list.removeAll(evenNumbers)
    println(list)
}

This version avoids modifying the list while iterating.  It creates a separate list containing even numbers and then uses `removeAll` to remove those even numbers from the original list. This approach is more predictable and avoids the potential pitfalls of modifying the list during iteration with `removeIf`.