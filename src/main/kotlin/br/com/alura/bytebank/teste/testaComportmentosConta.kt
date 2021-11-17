import modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val alex = Cliente(nome = "Alex", cpf = " ", senha = 1)
    val contaAlex = ContaPoupanca(alex, 1000)
    contaAlex.deposita(-200.0)

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)
    val contaFran = ContaCorrente(numero = 1001, titular = fran)
    /** pode mudar a ordem do constutor*/
    contaFran.deposita(300.0)
    /**
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0
    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0
     */
//    println(contaFran.titular)
//    println(contaFran.numero)
//    println(contaFran.saldo)
//
//    println(contaAlex.titular)
//    println(contaAlex.numero)
//    println(contaAlex.saldo)


    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(50.0)
    println(contaAlex.saldo)

    println("Transferência da conta da Fran para Alex")

    if (contaFran.transfere(1.0, contaAlex)) {
        println("Tranferência realizada com sucesso!")
    } else {
        println("Falha na transferência")
    }

    println(contaFran.saldo)
    println(contaAlex.saldo)
}
