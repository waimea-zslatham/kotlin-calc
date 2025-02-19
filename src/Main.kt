/**
 * A little Calculator for Kotlin
 */

fun main() {
    println("---------------------")
    println(" Calculator 2000 ")
    println("-----------------------")
    println()

    val number = getInt ("Please enter your first number")
    println(number)

    val numCalculation = ("+, -, *, /")

    println("I'm thinking of a number from 1 - 100")
    println("Can you guess it?")

    val scoreText = "1000"
    var score = scoreText.toIntOrNull()
    println("Score: $score")

    // MAIN LOOP
    while (true) {
        var playerName = getString("Enter Your Name: ")
        print("Nice to meet you, $playerName")
    }
    // Ask the user for a  guess
    val guess = getString().toIntOrNull()

    if (guess == null) {
        println("Enter a number!")
        continue
    }
    if (guess == numToGuess) {
        println("Yeah you got it!")
        val score = 1
        println("Score: $score")
        break
    }
    else if (guess > numToGuess)
        println("You have guessed too high")
    else
        println("You have guessed too low")

    // Check if it's correct

    // Break out of the loop if correct

    // Otherwise give high/lower feedback

}

/**
 * Function to get a string from the user
 * parameters
 *  - prompt - Text to show the user
 *  returns:
 *  - String that the user types
 */
fun getString(prompt: String): String {
    var userInput: String

    while(true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }

    return userInput
}

/**
 * Function to get an Int from the user
 */

fun getInt(prompt: String): Int {
    var intValue: Int?

    while (true) {
        val userInput = getString(prompt)
        intValue = userInput.toIntOrNull()
        if (intValue != null) break
    }

    return intValue!!
}