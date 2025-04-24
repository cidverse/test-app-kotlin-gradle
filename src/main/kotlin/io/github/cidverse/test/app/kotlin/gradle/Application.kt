package io.github.cidverse.test.app.kotlin.gradle

fun main(args: Array<String>) {
    if (args.size == 2) {
        val calc = Calculator()
        val result = calc.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]))
        println("Hello, World! The result is: $result")
    } else {
        println("Please provide two integer arguments.")
    }
}
