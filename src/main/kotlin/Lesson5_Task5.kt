import kotlin.random.Random

fun task5() {
    val winningList = listOf(Random.nextInt(0, 43), Random.nextInt(0, 43), Random.nextInt(0, 43))
    println("Введите ваши числа: ")
    val userList = listOf(readln().toInt(), readln().toInt(), readln().toInt())
    val result = winningList.intersect(userList)
    if (result.size == 3) {
        println("Поздравляем вы угадали 3 числа и выиграли джекпот!")
    } else if (result.size == 2) {
        println("Вы угадали 2 числа, вы получите крупный приз!")
    } else if (result.size == 1) {
        println("Вы угадали 1 число, вам будет выплачен утишительный приз")
    } else {
        println("Вы не угадали ни одного числа((")
    }

    println("Список выиграшных чисел: $winningList")
}

fun main() {
    task5()
}