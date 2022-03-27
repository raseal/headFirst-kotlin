fun main() {
    // Basic types: Byte, Short, Int, Long
    var number = 7
    var longNumber = 7L
    var binaryNumber = 0b10
    var hexNumber = 0xAF

    // Float or double
    var doubleByDefault = 123.5
    var forceFloat = 123.5F

    // Text
    var letter = 'D'
    var word = "Kotlin"

    // Forcing the compiler to create variables of a specific type
    var smallNum: Short = 6

    var myArray = arrayOf(1, 2, 3)
    val myArray2 = arrayOf(4, 5, 6)

    // myArray2 can't change (it was defined by "val" keyword)
    //myArray2 = arrayOf(7,8,9) <-- this throws an error
    // ...but we can still change anyone of its existing positions:
    myArray2[0] = 99

    // String template:
    var messageWithoutTemplate = "The size of the array is " + myArray.size + "and its first element is " + myArray[0]
    var templatedMessage = "The size of the array is ${myArray.size} and its first element is ${myArray[0]}"

    println(templatedMessage)
}