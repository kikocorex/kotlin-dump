fun main () {
    for (x in 1..15) {
        print(x)
    }

    for (x in 1 until 15) {
        print(x)
    }

    for(x in 1..15 step 2) {
        print(x)
    }

    for (x in 10 downTo 1 step 3) {
        print(x)
    }

    var x: Int = 1

    while(x<= 10) {
        print(x)
    }

    do {
        print(x)
    } while(x>=1)

}