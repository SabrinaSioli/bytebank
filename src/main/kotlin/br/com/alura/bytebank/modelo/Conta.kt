package br.com.alura.bytebank.modelo

import modelo.Cliente

abstract class Conta (
    var titular: Cliente,
    val numero: Int,
    /** é opcional, pode ficar só com o valor padrão
    val numero: Int = 0  é opcional, pode ficar só com o valor padrão*/

) {
    var saldo = 0.0
        protected set
    companion object {
        var total = 0
            private set
    }
    init { /** Permite executar trechos de código durante a inicialização */ }

    init {
        total++
        println("TotalContas: $total")
    }

    /** construtor secundário
    constructor (titular: String, numero: Int) {
    this.titular = titular
    this.numero = numero
    }*/

    fun deposita(valor: Double){
        this.saldo += valor
    }

    abstract fun saca(valor: Double)

    abstract fun transfere(valor: Double, destino: Conta): Boolean

    /**
    fun getSaldo() : Double {
    return saldo
    }

    fun setSaldo(valor: Double) {
    if(valor > 0) {
    saldo = valor
    }
    }
     */
}

class ContaCorrente (
    titular: Cliente,
    numero: Int = 0,
) : Conta(
    titular = titular,
    numero = numero,
    ){

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }

    override fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

}

class ContaPoupanca(
    titular: Cliente,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero,
) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    init {
    println(        total)
    }

    override fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }


}

class ContaSalario (
    titular: Cliente,
    numero: Int = 0,
) : Conta(
    titular = titular,
    numero = numero,
    ){

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }

    override fun transfere(valor: Double, destino: Conta): Boolean {
        println("Conta salário podem fazer transferencia!")
        return false
    }


}