import java.text.DecimalFormat

fun bodyMassIndexCalculator() {
    println("Введите Bаш вес в килограммах:")
    val weight = readln().toInt()
    println("Введите Ваш рост в сантиметрах:")
    val height = (readln().toDouble()) / 100
    val bodyMassIndex = (weight / (height * height))
    val decimecalFormat = DecimalFormat("#.00")
    val formattedBodyMassIndex = decimecalFormat.format(bodyMassIndex)

    when {
        formattedBodyMassIndex < "18.5" && formattedBodyMassIndex > "0" -> println("Ваш ИМТ = $formattedBodyMassIndex: Недостаточная масса тела")
        formattedBodyMassIndex >= "18.5" && formattedBodyMassIndex < "25" -> println("Ваш ИМТ = $formattedBodyMassIndex: Нормальная масса тела")
        formattedBodyMassIndex >= "25" && formattedBodyMassIndex < "30" -> println("Ваш ИМТ = $formattedBodyMassIndex: избыточная масса тела")
        formattedBodyMassIndex >= "30" -> println("Ваш ИМТ = $formattedBodyMassIndex: Ожирение")
        else -> println("Были введены неверные параметры веса или роста.")
    }
}

fun main() {
    bodyMassIndexCalculator()
}