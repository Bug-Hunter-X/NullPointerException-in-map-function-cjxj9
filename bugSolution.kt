fun main() {
    val list2 = listOf(1, 2, null, 4, 5)

    // Solution 1: Using the safe call operator
    val result2a = list2.map { it?.times(2) ?: 0 }
    println(result2a) // Output: [2, 4, 0, 8, 10]

    //Solution 2: Filtering null values before mapping
    val result2b = list2.filterNotNull().map { it * 2 }
    println(result2b) // Output: [2, 4, 8, 10]

    // Solution 3: Using the let function
    val result2c = list2.map { it?.let { it * 2 } ?: 0 }
    println(result2c) // Output: [2, 4, 0, 8, 10]
} 