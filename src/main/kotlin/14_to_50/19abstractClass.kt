package `14_to_50`

//jadi kita hanya dapat memanggil class turunan dari class abstract
import data.nameOfstudent
import data.nameOfteacher

fun main() {
    //val person1 = abstractClass("Pandu") //eror,karena abstract class tidak bisa dibuat objectnya,harus diturunkan ke class lain dahulu
    val person1 = nameOfstudent("Pandu")
    val person2 = nameOfteacher("jamal nasarudin")

    println(person1.nama)
    println(person2.nama)
}