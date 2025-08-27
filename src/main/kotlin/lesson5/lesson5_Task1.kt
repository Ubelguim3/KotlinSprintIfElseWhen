package lesson5

import kotlin.random.Random

fun task1() {
    val firstNum = Random.nextInt(0,101)
    val secondNum = Random.nextInt(0,101)
    println("Решите данный пример: $firstNum + $secondNum = ?")
    val result = readln().toInt()
    if (result == firstNum + secondNum) {
        println("Добро пожаловать!")
    }
    else {
        println("Доступ запрещен.")
    }
}

fun main() {
    task1()
}
