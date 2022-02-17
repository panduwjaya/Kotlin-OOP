package `14_to_50`

import data.SmartPhone

//Di kotlin semua class yang tanpa parent class,merupakan class turunan dari class any
//any adalah superclass dari semua class yang kita buat pada kotlin,superclass pada java adalah object class
//jadi setiap kita membuat class secara tidak langsung secara otomatis class yg kita buat merupakan turunan dari class any
//struktur anyclass terdiri dari fungsi equals(any?):Boolean,hascode():Int dan toString():String

fun main(args: Array<String>) {
    val smartphone = SmartPhone("xiaomi","andorid")
    println(smartphone.toString())//result = alokasi memori,package.nama_class@alokasi memori
    println(smartphone.hashCode())//result = alokasi memori dalam bentuk representasi angka
}