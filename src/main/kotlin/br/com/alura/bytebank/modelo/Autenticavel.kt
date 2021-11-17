package modelo

interface Autenticavel {


    open fun autentica(senha: Int): Boolean

}