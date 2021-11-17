package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Conta
import modelo.Autenticavel

fun testaObjects() {
    /** Não é recomendável usar dessa forma
    /*
    val palavra: kotlin.String = " "
    //* String pelo java não pode ser da forma literal = "" */
    //val palavraJava: java.lang.String = java.lang.String(" ")
    val palavraJava: StringJava = StringJava(" ")
    */
     * */
    var hello = object : Autenticavel {
        var name = "Sabrina"
        var endereco: String = "sei la"
        var senha: Int = 0

        override fun autentica(senha: Int): Boolean {
            println("hehe mlk")
            return true
        }

    }

    println(hello.name)
    println(hello.autentica(1))

    println("total: ${Conta.total}")
}