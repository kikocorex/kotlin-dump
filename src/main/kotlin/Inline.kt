inline fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}


fun main( ) {
    val result = performOperation(5, 3) { x, y -> x + y } // The lambda is inlined
    print(result)
}
