package `14_to_50`

import data.LazyProperties

fun main() {
    val example = LazyProperties()
    println(example.paramA)
    println(example.paramA)
    println(example.paramA)
    //ketika kita memanggil println(example.paramA) sebanyak 3 kali,maka lazy properties hanya terpanggil sekali saja
    //alasan disebut sebagai lazy properties karena,ketika kita memanggil println(example.paramA) sebanyak 3 kali,maka lazy properties hanya terpanggil sekali
}