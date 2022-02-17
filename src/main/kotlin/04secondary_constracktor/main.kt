package `04secondary_constracktor`

import data2.JustData

fun main() {
    //jadi setiap kita memaggil secondary first maka kita juga akan memanggil primary constructor
    //jika kita memanggil secondary second maka akan memanggil secondary first dan primary constructor
    //jadi sifat seperti recursive
    val objek1 = JustData("toyota")
    val objek2 = JustData("mercedes","matic")
    val objek3 = JustData("bmw","manual","power sterling")
}