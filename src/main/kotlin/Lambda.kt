fun main() {
    val add: (Int, Int) -> Int = { a, b -> a + b }
    val square: (Int) -> Int = { x -> x * x }

// Using lambda expressions with higher-order functions
    val numbers = listOf(1, 2, 3, 4, 5)
    val squares = numbers.map { it * it }

    print(numbers)
    print(squares)
}