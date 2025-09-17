const val DISTANCE_FOR_FUEL_CONSUMPTION = 100

fun fuelCalculator() {
    println("Введите расстояние вашей поездки(В километрах):")
    val tripDistance = readln().toFloat()
    println("Введите расход топлива(В литрах) на 100 километров:")
    val fuelConsumption = readln().toFloat()
    println("Введите цену за литр топлива:")
    val fuelCost = readln().toFloat()

    val totalFuelConsumption = (tripDistance * fuelConsumption) / DISTANCE_FOR_FUEL_CONSUMPTION
    val totalMoneyForFuel = totalFuelConsumption * fuelCost

    val formatFuelConsumtion = String.format("%.2f", totalFuelConsumption)
    val formatTotalMoney = String.format("%.2f", totalMoneyForFuel)


    println("Необходимое количество топливо на вашу поездку: $formatFuelConsumtion л.\n" +
            "Необходимое количество денег на топливо: $formatTotalMoney руб.")
}

fun main() {
    fuelCalculator()
}