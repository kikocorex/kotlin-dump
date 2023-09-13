fun String.capitalizeWords(): String {
    return split(" ").joinToString(" ") { it.capitalize() }
}

fun String.toStringd(): String {

    return "w";
}

fun main() {
    val text = "hello world"
    val capitalizedText = text.capitalizeWords() // "Hello World"
    println(capitalizedText)
    println(text.toStringd())
}

