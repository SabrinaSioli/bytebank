package modelo

abstract class Funcionario( //ope indica q a classe é aberta para herança
    val nome: String,
    val cpf: String,
    val salario: Double,
){
    //resumuida
    //open fun bonificacao(): Double = salario * 0.1


    abstract fun bonificacao() : Double



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