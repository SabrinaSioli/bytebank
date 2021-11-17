package modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            print("Bem vindo ao ByteBank")
        } else {
            println("Falha na autenticação! ")
        }
    }


}