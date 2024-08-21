fun main() {
    var nome:String? = "Gabriel Monteiro"
    nome = null
    println(nome)
    var funcPrint = print()
    println(funcPrint)
}

fun print(): String {
    return "Teste"
}