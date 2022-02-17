package `02constractor`
import data.constractor
fun main(){

    //memanggil constructor dan mengisi data dalam parameter constructor
    val Pandu = constractor("pandu","kusuma","wijaya")
    Pandu.firstName = "Bintang" //kita juga dapat mengubah isi dari constractor secara manual
    val Ujang = constractor("Ujang","jammal","aji")

    //proses mencetak hasil dari constructor
    println(Pandu.firstName)
    println(Pandu.middleName)
    println(Ujang.firstName)
    println(Ujang.lastName)
}