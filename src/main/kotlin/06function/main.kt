package `06function`

import data.function

fun main(){
    val person = function("eko")
    person.lahir = "solo" //mengisi variabel dalam class
    person.run() //memanggil fungsi
    person.say_hello("pandu") //memanggil dalam parameter langsung

    //alasan funtion dibawah ini menggunakan println adalah karena fungsi dibawah ini menggunakan return function
    val result = person.aritmathic(9,8) //menghitung menggunakan fungsi
    println(result)
    val result2 = person.fullName("bintang","raffi")
    println(result2)
}