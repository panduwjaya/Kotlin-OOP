package `14_to_50`

//public = tidak perlu menyebutkan maka secara otomatis sudah menjadi publib
//private = hanya dapat diakses di tempat deklarasi
//protected = hanya dapat di akses di tempat deklarasi/class turunan nya
//internal = hanya dapat diakses pada file di project yang sama

//fungsi dari visibility modifier adalah biasanya
//memberi keyword "protected" pada bagian-bagian kecil di project kita

//ini public,bebas bisa ditulis public atau tidak
open public class firstExam(){
    fun pertama(){
        println("ini adalah fungsi dari class publib")
    }

    //kita juga dapat men overide fungsi protected kepada class secondExam dengan keyword "open"
    open protected fun ketiga(){
        println("ini adalah fungsi yang dibuat dengan protected")
    }
}

//kita dapat meletakan private di dalam class public
public class secondExam(): firstExam(){
    private fun kedua(){
        println("ini adalah fungsi yang dibuat dengan private")
    }

    //ketika mengoveride jangan lupa tambahkan public nama_fungsi
    override public fun ketiga(){
       super.ketiga()//mengambil value dari fun ketiga menggunakan keyword "super"
    }
}

fun main(){
    val subjectPerson1 = secondExam()
    //subjectPerson1.kedua() //eror karena visibilitynya adalah private pada fungsi kedua
    subjectPerson1.ketiga()
}