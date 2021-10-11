package com.example.collections

fun main() {
    val joao = Funcionario(nome = "João" , salario = 1500.0 , tipocontratacao = "PJ")
    val maria = Funcionario(nome = "Maria" , salario = 1000.0 , tipocontratacao = "CLT")
    val jose = Funcionario(nome = "Jose" , salario = 2000.0 , tipocontratacao = "PJ")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(jose.nome, jose)
    repositorio.create(maria.nome, maria)

    println(repositorio.findByid(joao.nome))
}