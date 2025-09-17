fun task4() {
    val login = "Zaphod"
    val password = "PanGalactic"
    println("Введите имя пользователя для входа в систему:")
    val userLogin = readln()
    if (userLogin == login) {
        println("Введите пароль:")
        val userPassword = readln()
        if (userPassword == password) {
            println("Пользователь \"Zaphod\", вам разрешен вход на борт корабля \"Heart of Gold\"!")
        }
        else {
            println("Невереный пароль.")
        }
        }
    else {
        println("Имя пользователя - неверно. Хотите зарегестрироваться?")
    }
}

fun main() {
    task4()
}