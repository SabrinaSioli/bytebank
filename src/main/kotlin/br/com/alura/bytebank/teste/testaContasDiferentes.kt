import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.ContaSalario
import br.com.alura.bytebank.modelo.Endereco
import modelo.*

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(nome = "Alex", cpf = "", senha = 1, endereco = Endereco(logradouro = "Rua Riso do Prado")),
        numero = 1000,
    )

    println("Titular: ${contaCorrente.titular.nome}")
    println("Logradouro: ${contaCorrente.titular.endereco.logradouro}")


    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Fran", cpf = "", senha = 1),
        numero = 1001
    )

    val contaSalario = ContaSalario(
        titular = Cliente(nome = "Dani", cpf = "", senha = 1),
        numero = 1002
    )

    contaPoupanca.deposita(1000.0)
    contaCorrente.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println(contaCorrente.saldo)
    println(contaPoupanca.saldo)
    println(contaSalario.saldo)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println(contaCorrente.saldo)
    println(contaPoupanca.saldo)
    println(contaSalario.saldo)

    contaCorrente.transfere(500.0, contaPoupanca)
    contaPoupanca.transfere(2.0, contaCorrente)
    contaSalario.transfere(2.0, contaCorrente)

    println("Saldo após transferir da conta poupança para a corrente ${contaCorrente.saldo}")
    println("Saldo após transferir da conta corrente para a poupança ${contaPoupanca.saldo}")
    println("Saldo após transferir da conta corrente para a conta Salario ${contaSalario.saldo}")
}
