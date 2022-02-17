package `14_to_50`

//pada kali ini kita akan membahas typeAlias dengan lamdbda expresion function

//tujuan nya agar kita tidak prlu menulis () -> String berulang kali
typealias ChangeString = () -> String

//fungsi sebagai parameter,format penulisan = ${supplier()}
fun sayHay (supplier: ChangeString){
    println("hello ${supplier()}")
}

fun main(args: Array<String>) {
    sayHay{"everybody"}
}