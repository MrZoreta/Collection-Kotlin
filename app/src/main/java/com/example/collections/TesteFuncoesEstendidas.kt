package com.example.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "3000".toBigDecimal()

    )
    salarios.forEach { println(it) }
    
    println("-------------")
    println(salarios.somatoria())

    println("-------------")
    println(salarios.media())

}