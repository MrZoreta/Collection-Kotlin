package com.example.collections

fun main() {
    val joao = Funcionario(nome = "João" , salario = 1500.0 , tipocontratacao = "PJ")
    val maria = Funcionario(nome = "Maria" , salario = 1000.0 , tipocontratacao = "CLT")
    val jose = Funcionario(nome = "Jose" , salario = 2000.0 , tipocontratacao = "PJ")

    println("---------- List ---------")
    val funcionarios = mutableListOf(jose, maria)
    funcionarios.forEach{println(it)}

    println("-------------------")
    funcionarios.add(joao)
    funcionarios.forEach { println(it)}
//serve para o uso de listas que deseja mudar apos o load

    println("-------------------")
    funcionarios.remove(maria)
    funcionarios.forEach { println(it)}

    println("---------- Set ---------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it)}
    println("-------------------")
    funcionariosSet.add(maria)
    funcionariosSet.add(jose)
    funcionariosSet.forEach { println(it)}

    println("-------------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it)}

}