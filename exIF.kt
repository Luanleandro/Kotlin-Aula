fun main (){
    var nome:String? = "Gabriel"
    println("Olá $nome")
   // nome = null
    println("olá $nome")
    if (nome!=null) {
        println("$nome possui: ${nome.length} char.")
    }
}