import modelo.Cliente
import modelo.Diretor
import modelo.Gerente
import modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Igor",
        cpf = "111.111.111-0",
        salario = 1000.0,
        senha = 1000
    )

    val diretora = Diretor(
        nome = "Fran",
        cpf = "222.222.222-2",
        salario = 2000.0,
        senha = 2000,
        plr = 0.1
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-0",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 1234)
}

