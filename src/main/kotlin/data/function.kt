package data

//function bisa dimasukan kedalam sebuah class
//dalam penulisan parameter function di dalam class kita tidak memerlukan val atau var pada parameter
//function yg kita deklarasikan di dalam class secara otomatis menjadi behaviour si object yang dibuat dari class tersebut

class function(val paramPark: String) {
    var lahir: String = ""
    fun say_hello(name: String){
        println("hallo namaku $name,aku lahir di $lahir")
    }

    fun run(){
        println("saya berlari")
    }

    fun aritmathic(a: Int = 0,b: Int = 0): String{
        var hasil = a*b
        return "hasil dari $a * $b = $hasil"
    }

    fun fullName(first: String,last: String): String{
        return "My Name is $first $last"
    }
}