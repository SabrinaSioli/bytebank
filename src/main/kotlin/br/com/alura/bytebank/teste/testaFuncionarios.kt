import modelo.Analista
import modelo.CalculadoraBonificacao
import modelo.Diretor
import modelo.Gerente

fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111111-0",
        salario = 1000.0
    )

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-0",
        salario = 2000.0,
        senha = 2000
    )

    val gui = Diretor(
        nome = "Gui",
        cpf = "222.222.222-0",
        salario = 2000.0,
        plr = 3.3
    )

    val ana = Analista(
        nome = "Ana",
        cpf = "444.444.444-0",
        salario = 4000.0,
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("Bonificação  ${alex.bonificacao()}")

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("Bonificação  ${fran.bonificacao()}")

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("Bonificação  ${gui.bonificacao()}")
    println("plr  ${gui.plr}")

    if (fran.autentica(1223)) {
        println("Autenticação feita com sucesso!")
    } else {
        println("Acesso negado!")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(alex)

    println("Total da bonificacao é ${calculadora.total}")
}
