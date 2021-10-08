package com.example.collections

fun main() {
    val salarios = doubleArrayOf(1000.0 , 2000.0 , 3000.0)

    for (salario in salarios) {
    println(salario)
    }
    println("-------------")
    println("maior salario ${salarios.maxOrNull()}")
    println("menor salario ${salarios.minOrNull()}")
    println("media salario ${salarios.average()}")

    val salariosfiltrados = salarios.filter { it > 1500.0 }
    //foi realizado o uso de um filtro constando verdade ou falso
    println("-------------")
    salariosfiltrados.forEach() { println(it)}

    println("-------------")
    println(salarios.count { it in 2000.0..5000.0 })
    //o resultado aparece em números de elementos presentes de acordo com o pedido

    println("-------------")
    println(salarios.find { it == 2000.0 })

    println("-------------")
    println(salarios.any { it == 1000.0 })
    //o retorno é em forma de true or false
}
