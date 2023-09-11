import java.util.Scanner;

fun main(args: Array<String>) {

    val read = Scanner(System.`in`)
    print("Enter num: ")
    val num = read.nextInt()

    println(num)

    when(num) {
        1 -> print(1)
        2 -> print(2)
    }
}