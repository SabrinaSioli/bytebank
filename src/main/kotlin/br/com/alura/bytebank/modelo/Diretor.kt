package modelo

class Diretor (
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int = 123,
    val plr: Double
    ) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    override fun bonificacao(): Double {
        return salario + plr
    }


}