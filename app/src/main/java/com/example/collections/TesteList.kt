package com.example.collections

fun main() {
    val joao = Funcionario(nome = "João" , salario = 1500.0 , tipocontratacao = "PJ")
    val maria = Funcionario(nome = "Maria" , salario = 1000.0 , tipocontratacao = "CLT")
    val jose = Funcionario(nome = "Jose" , salario = 2000.0 , tipocontratacao = "PJ")

   val funcionarios = listOf(joao , maria , jose)

    funcionarios.forEach(){ println(it) }
    println("---------------")
    println(funcionarios.find {it.nome == "João"})

    println("---------------")
    funcionarios.sortedBy { it.salario } //a ordenação pode ser por salario ou nomes
        .forEach {println(it)}

    println("---------------")
    funcionarios.groupBy { it.tipocontratacao }
        .forEach {println(it)}
}
data class Funcionario(
    val nome :String,
    val salario :Double,
    val tipocontratacao :String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
    }

