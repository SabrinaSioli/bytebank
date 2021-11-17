package modelo

import br.com.alura.bytebank.modelo.Endereco

class Cliente(
    val nome: String,
    val cpf: String,
    protected val senha: Int,
    var endereco: Endereco = Endereco(), //se torna opcional
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if ( this.senha == senha) {
            return true
        }
        return false
    }

}
