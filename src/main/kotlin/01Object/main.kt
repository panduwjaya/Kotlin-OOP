package `01Object`

import data.Animals
//membahas tentang arti object OOP
fun main(){
    ////kuda////
    val kuda = Animals()
    kuda.name = "alexandria"
    kuda.leg = 4
    kuda.year = 2021

    println(kuda.name)
    println(kuda.leg)
    println(kuda.year)

    ////kambing////
    val kambing = Animals()
    kambing.name = "imanuel"
    kambing.leg = 4
    kambing.year = 2020

    println(kambing.name)
    println(kambing.leg)
    println(kambing.year)
}