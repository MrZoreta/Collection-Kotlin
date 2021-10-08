package com.example.collections

fun main() {
    val joao = Funcionario(nome = "João" , salario = 1000.0)
    val maria = Funcionario(nome = "Maria" , salario = 1500.0)
    val jose = Funcionario(nome = "Jose" , salario = 2000.0)

   val funcionarios = listOf(joao , maria , jose)

    funcionarios.forEach(){ println(it) }
    println("---------------")
    println(funcionarios.find {it.nome == "João"})

}
data class Funcionario(
    val nome :String,
    val salario :Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
    }

