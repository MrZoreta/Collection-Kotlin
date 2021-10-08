package com.example.collections

fun main() {
    val nomes = Array<String>(3) {" "}

    nomes[0] = "Eduarda"
    nomes[1] = "Evelyn"
    nomes[2] = "Arthur"
    for (nome in nomes) {
        println(nome)
    }
    println("------------------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("_______________")

    val nomes2 = arrayOf("Arthur" , "Eduarda" , "Evelyn")

    for (nome2 in nomes2) {
        println(nome2)
    }
}







