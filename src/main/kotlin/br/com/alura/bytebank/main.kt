import br.com.alura.bytebank.modelo.Endereco
//qlq coisa ai em baixo
//import java.lang.String as StringJava


fun main() {
    val endereco = Endereco(logradouro ="Rua vergueiro",
        cep ="00000-0700",
        complemento = "Alura")
    val enderecoNovo = Endereco(logradouro ="Rua vergueiro",
        cep ="00000-0700",
        complemento = "Alura")

    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    /*
    println(endereco.toString())

    val objeto: Any = Any()

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")

    imprime(objeto)
    imprime(1)
    imprime(1.5)
    val teste : Any = imprime(endereco)
    println(teste)
    */
    //testaFuncionarios()

}

fun imprime(valor: Any) : Any {
    println(valor)
    return valor
}

