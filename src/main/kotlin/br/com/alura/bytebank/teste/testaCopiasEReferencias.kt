import modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias(){

    /* Cópia por valor */
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numeroX $numeroX")
    println("numeroY $numeroY")

    /* Cópia por referência */
    val contaJoao = ContaCorrente(Cliente("Joao", "", 1), 1003)
    var contaMaria = contaJoao


    println("titular conta joao: ${contaJoao.titular.nome}")
    println("titular conta maria: ${contaMaria.titular.nome}")

    contaMaria.titular = Cliente("Breno", "", 2)

    println(contaJoao.titular.nome)
    println(contaMaria.titular.nome)
}