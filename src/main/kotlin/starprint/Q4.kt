package starprint

fun main(arg: Array<String>) {
    for (r in 1..5)
    {
        for (s in 5 downTo r)
        {
            print(" *")
        }

        println()
    }
}