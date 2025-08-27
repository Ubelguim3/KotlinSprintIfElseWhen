import kotlin.random.Random

fun task3() {
    val winningNumber1 = 27
    var winningNumber2 = 9

    println("Введите первое число из вашего лотерейного билета:")
    val num1 = readln().toInt()
    println("Введите второе число из вашего лотерейного билета:")
    val num2 = readln().toInt()


    when {
        (num1 == winningNumber1 && num2 == winningNumber2) || (num2 == winningNumber1 && num1 == winningNumber2) -> println(
            "Поздравляем! Вы выиграли главный приз!"
        )

        (num1 != winningNumber1 && num2 == winningNumber2) || (num2 == winningNumber1 && num1 != winningNumber2) ||
                (num1 == winningNumber2 && num2 != winningNumber1) || (num1 == winningNumber1 && num2 != winningNumber2) -> println(
            "Вы выиграли утешительный приз!"
        )

        else -> println("Неудача!")
    }
    println("Выиграшные числа: $winningNumber1 $winningNumber2")
}

fun main() {
    task3()
}