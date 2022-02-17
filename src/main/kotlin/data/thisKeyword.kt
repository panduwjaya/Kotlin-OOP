package data

//this adalah keyword yang bisa digunakan untuk merefrensikan object saat ini
//this hanya bisa digunakan di dalam class itu sendiri
//kegunaan ths adalah untuk memanggil properties yg ada pada class yg terkena shadow
//shadow adalah sejenis overwrite dalam bahasa pemograman
//biasanya untuk mengakses properties yg tertutup oleh parameter karena menggunakan nama yg sama

class thisKeyword (val constA: String){
    var firstName: String = "Eko" //ini properties yang memiliki nama yg sama dengan parameter pada function halloeveryone

    fun helloEveryone(firstName: String){
        println("hallo my name is $firstName")//hasilnya "pandu"
        println("hallo my name is ${this.firstName}")//ini contoh yang bernama sama,hasilnya "Eko"
        println("hallo my name is ${this.constA}")//this ini mengakses primary constructor pada class
    }
}