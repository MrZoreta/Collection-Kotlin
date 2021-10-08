package com.example.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 5
    values[2] = 3
    values[3] = 4
    values[4] = 2

    for (valores in values) {
        println(valores)
    }
    println("--------------------")
    values.forEach {
        println(it)
    }
    println("--------------------")
    for (index in values.indices) {
        println(values[index])
    }
    println("--------------------")
    values.sort()
    for (valor in values ) {
     println(valor)
    }

}
