package com.example.collections

fun main() {
    val joao = Funcionario(nome = "João" , salario = 1500.0 , tipocontratacao = "PJ")
    val maria = Funcionario(nome = "Maria" , salario = 1000.0 , tipocontratacao = "CLT")
    val jose = Funcionario(nome = "Jose" , salario = 2000.0 , tipocontratacao = "PJ")

    val funcionariosmasc = setOf(joao, jose)
    val funcionariosfem = setOf(maria)

    val resultUnion = funcionariosfem.union(funcionariosmasc)
    resultUnion.forEach{println(it )}
//tem a funcao de unir duas categorias

    println("---------------------")
    val funcionariosfemasc = setOf(joao, jose, maria)
    val resultSubtract = funcionariosfemasc.subtract(funcionariosfem)
    resultSubtract.forEach{println(it )}
//tem a funcao de substrair o que tem em uma categoria e não tem em outra

    println("---------------------")
    val resultIntersect = funcionariosfemasc.intersect(funcionariosfem)
    resultIntersect.forEach{println(it)}



}