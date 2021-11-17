package modelo

class Auxiliar(
    titular: String,
    cpf: String,
    salario: Double,
    nome: String,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override fun bonificacao(): Double {
        return salario * 0.6
    }
}