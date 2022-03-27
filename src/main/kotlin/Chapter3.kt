fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)

    printResult(gameChoice, userChoice)
}

fun random(min: Int, max: Int): Int = (min..max).random()

fun getGameChoice(optionsParam: Array<String>): String = optionsParam[random(0, optionsParam.size -1)]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        println("Please enter one of the following:")

        for (item in optionsParam) {
            println("\t $item")
        }

        val userInput = readLine()

        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        } else {
            println("You must enter a valid choice")
        }
    }

    return userChoice
}

fun printResult(gameChoice: String, userChoice: String) {
    println("Game chose: $gameChoice ** You chose: $userChoice")

    if (userChoice == gameChoice) {
        println("Tie!")
    } else if (
        (userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")
    ) {
        println("You win!")
    } else {
        println("You lose!")
    }
}