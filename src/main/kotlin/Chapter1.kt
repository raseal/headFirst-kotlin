fun main(args: Array<String>) {
    var x = 1
    var y = 3

    println("Before the loop,  x = $x")

    while (x < 4) {
        println("-- In the loop, x = $x")
        x++
    }

    println("After the loop, x = $x")

    println(if (x > y) "x is greater than y" else "x is not greater than y")
}