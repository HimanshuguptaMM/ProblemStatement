package starprint

fun main(arg: Array<String>) {
    for (r in 1..5) {
        for (s in 5..r) {
            print("")
        }
        for (c in 1..r) {
            print(" *")
        }
        println()
    }
}