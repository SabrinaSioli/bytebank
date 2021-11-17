package modelo

abstract class FuncionarioAdmin( //ope indica q a classe é aberta para herança
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {
    //resumuida
    //open fun bonificacao(): Double = salario * 0.1

    override fun autentica(senha: Int): Boolean {
        if ( this.senha == senha) {
            return true
        }
        return false
    }
    /**
     * Propery style
     * open val bonificacao: Double
     *     get() {
     *          return salario * 0.1
     *     }
     *  function oneline style
     *  open fun bonificacao: Double = salario * 0.1
     */

}