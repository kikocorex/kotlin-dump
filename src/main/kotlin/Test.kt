import java.util.*

fun add(a: Int, b: Int):Int {
    return a+b
}
fun createPrintArray(args: Array<Int>) {

}

/*fun getChar(input: String):Char {


  for(letter in input) {

      return letter
  }
  return 'a'
fun Int.isEven() = this % 2 == 0;
*/

fun printMenu() {
    println("1. Add numbers")
    println("2. Get the min of two numbers")
    println("3. Get the index of a input string ")

}

fun changeNumber() {

    val reader = Scanner(System.`in`)

    print("Input the first number: ")
    var num1:Int = reader.nextInt()

    print("Input the second number: ")
    var num2:Int = reader.nextInt()

}

fun getChoice() {

    val reader = Scanner(System.`in`)

    print("Input the first number: ")
    var num1:Int = reader.nextInt()

    print("Input the second number: ")
    var num2:Int = reader.nextInt()

    printMenu()

    println("\n Enter choice: ")
    var input:Int = reader.nextInt()

    while (input != 10) {

        printMenu()
        println("\n Enter choice: ")
        var input:Int = reader.nextInt()


        when(input) {
            1 -> println(add(num1,num2))

            2 -> println("asdasd")

            3 -> print("3")

            else -> print("IDK")
        }
    }
}

val lambda4 : String.(Int) -> String = { this + it }

val lambda5 = { a: Int, b: Int -> a + b}

fun main(args: Array<String>) {
    val result = lambda5(2,5)
    print("The result is $result")

    val test = { println( "\n123") }
    val product = {a: Int , b: Int -> a * b}

    test()
    val prodRes =  product(2,3)
    print(prodRes)
}

fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}



/*
fun higherfunc( str : String, mycall :(String)-> Unit) {

   // inovkes the print() by passing the string str
   mycall(str)
}

// main function
fun main(args: Array<String>) {
   print("GeeksforGeeks: ")
   higherfunc("A Computer Science portal for Geeks",::print)
}
*/

/*
fun isString(obj: Any) {
   println("Object $obj is ${if (obj !is String) "not" else ""} a String")
}

fun main(args: Array<String>) {
   isString("ABC")
   isString("10")
   isString(10)
}*/


/*  for (i in 0 until 5) {
     println("printed " + i +" times")
 }

 // test
 var i = 5
 while (i > 0) {
     println("printed 5 times")
     i--
 }*/
/*
  val isFourEven = 4.isEven()
  println(isFourEven)

println(getChar("Testing "))*

  var text = "testing"
  for(letter in text) {
      println(letter)
  }*/


/*class Car {
   var brand: String = ""
   var model: String = ""
   var topSped: Int = 0
}*/

/*
class Car( var brand: String,  var model: String, var topSped: Int )

fun main() {
   var c1 = Car("", "" , 0)

   println(c1)
}*/

