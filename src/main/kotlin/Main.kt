package org.example

fun main() {
    val lamborghini = Lamborghini(
        name = "Murcielago",
        price = 500000
    )
    lamborghini.startEngine()
    println("${lamborghini.getPrice()}$")
}

/**
 * Lamborghini - класс для создания автомобиля и взаимодействия с ним
 * @constructor name - название автомобиля,
 * price - цена автомобиля
 * @author Лапицкий Даниил Владимирович AKA DaNN
 */
class Lamborghini(
    val name: String,
    private val price: Int
) {
    /**
     * Метод для запуска двигателя
     */
    fun startEngine() {
        println("$name started")
    }
    /**
     * Метод для получения цены
     * @return цена автомобиля
     */
    fun getPrice(): Int {
        return price
    }
}