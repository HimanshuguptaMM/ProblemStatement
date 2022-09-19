package starprint

fun main() {

    Question2()
}

fun Question2() {

    var n = 6

    for (i in 0 until n) {

        for (j in 0 until i) {
            print(" *")
        }
        println(" ")
    }
}