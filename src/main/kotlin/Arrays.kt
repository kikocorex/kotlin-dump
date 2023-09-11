fun main() {
    var arr1 = arrayOf(2,3,"test") //

    var arr2 = arrayOf<Int>(1,2,3,4)

        //KOTLIN SET AND GET
        arr1.set(0,20)
        println("Get: " + arr1.get(2) + "\n")

    for(x in arr1) {
        println(x)
    }

    for(x in 0 until arr1.size) {
        println(arr2[x])
    }
}