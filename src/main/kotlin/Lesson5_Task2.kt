const val AGE = 18
const val YEAR = 2025

fun task2() {
    println("Введите ваш год рождения:")
    val birthYear = readln().toInt()
    if (YEAR - birthYear >= AGE) {
        println("Показать экран со скрытым контентом")
    }
    else {
        println("Доступ запрещен")
    }
}

fun main() {
task2()
}