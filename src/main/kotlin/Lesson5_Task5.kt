import kotlin.random.Random

fun task5() {
    val winningList = listOf(Random.nextInt(0, 43), Random.nextInt(0, 43), Random.nextInt(0, 43))
    println("Введите ваши числа: ")
    val userList = listOf(readln().toInt(), readln().toInt(), readln().toInt())
    val result = winningList.intersect(userList)
    when (result.size) {
        3 -> println("Поздравляем вы угадали 3 числа и выиграли джекпот!")
        2 -> println("Вы угадали 2 числа, вы получите крупный приз!")
        1 -> println("Вы угадали 1 число, вам будет выплачен утешительный приз")
        else -> println("Вы не угадали ни одного числа((")
    }

    println("Список победных чисел: $winningList")
}

fun main() {
    task5()
}