/**
 * A little Calculator for Kotlin
 */

fun main() {
    println("---------------------")
    println(" Calculator 2000 ")
    println("-----------------------")
    println()

    val playerName = getString("Enter Your Name: ")
    print("Nice to meet you, $playerName, ")

    val firstNumber = getInt("Please enter your first number ")
    val op = getString("Please enter an operation (+, -, *, /) ")
    val secondNumber = getInt("Please enter your second number ")

    when(playerName) {
        "+" ->
            println("The result is ${firstNumber + secondNumber}")

        "-" ->
            println("The result is ${firstNumber - secondNumber}")

        "*" ->
            println("The result is ${firstNumber * secondNumber}")

        "/" ->
            println("The result is ${firstNumber / secondNumber}")
    }
    else
         println("Unknown operation")
}

fun getString(prompt: String): String {
    var userInput: String

    while(true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }

    return userInput
}


fun getInt(prompt: String): Int {
    var intValue: Int?

    while (true) {
        val userInput = getString(prompt)
        intValue = userInput.toIntOrNull()
        if (intValue != null) break
    }

    return intValue!!
}
