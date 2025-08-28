import kotlin.random.Random

fun task3() {

    val listOfWinningNumbers = listOf(9, 27)

    println("Введите первое число из вашего лотерейного билета:")
    val num1 = readln().toInt()
    println("Введите второе число из вашего лотерейного билета:")
    val num2 = readln().toInt()

    val listOfUserNumbers = listOf(num1, num2)
    val resultList = listOfWinningNumbers.intersect(listOfUserNumbers)

    if (resultList.size == 2) {
        println("Поздравляем Вы отгадали все числа! Вы выиграли главный приз!")
    } else if (resultList.size == 1)
        println("Вы отгадали одно число и выиграли утешительный приз!")
    else {
        println("Неудача!")
    }
    println("Выиграшные числа: $listOfWinningNumbers")
}

fun main() {
    task3()
}