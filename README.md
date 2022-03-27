# headFirst Kotlin
Basic `Kotlin` training using the *Head First: Kotlin* book

## Chapter 1
- Use `var` to define a variable whose value may change
- Use `val` to define a variable whose value wil stay the same
- You can use the `REPL` tool to evaluate code without compiling the project. In order to do so, go to **Tools -> Kotlin -> Kotlin REPL**

## Chapter 2: variables
- String template
- `val` still lets you change one existent element of an array

## Chapter 3: functions
- Game: RockPaperScissors
- All function parameters are treated as `val` so they can't be changed inside the function
- Iterate between ranges:
  - `for (x in 1..100)` will iterate from `1` to `100`
  - `for (x in 1 until 100)` will iterate from `1` to `99`
  - `for (x in 15 downTo 1)` will iterate in reverse (from `15` to `1`)
  - `for (x in 1..100 step 2)` will iterate from `1` to `100` but by adding 2 (1, 3, 5, 7...)