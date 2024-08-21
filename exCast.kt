class car() {
    var model = ""
    var year = ""
    var motor = ""
}

fun main() {
    var listNum = arrayOf(0, 10, 5, 3, 8 ,0)
    var soma = 0
    for(num in listNum){
        soma+=num
    }
    println(soma / listNum.size)
}