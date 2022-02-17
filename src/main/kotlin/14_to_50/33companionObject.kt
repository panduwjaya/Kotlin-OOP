package `14_to_50`

//companion object
//FUNGSI COMPANION OBJECT
//fungsi dari companion object adalah ketika kita mengakses data member dari class,kita tidak memerlukan object pada fun main
//fungsinya adalah ketika ingin membuat singleton object yang namanya sama dengan nama sebuah class
import data.CompanioObject

fun main() {
    //terdapat 2 jenis penulisan companion pada fun main:
    //pertama,menuliskan nama class diikuti kata "Companion" baru kemudian diikuti nama properties
    //kedua,menuliskan nama class lalu properties <- ini lebih disarankan
    println(CompanioObject.Companion.objek("NAMA SAYA: PANDU"))
    println(CompanioObject.objek("NAMA SAYA: MUHKITO"))
    CompanioObject.objek("MY NAME IS EKO")//MENGAKSES DATA MEMBER DARI CLASS TANPA MEMERLUKAN OBJECT PADA FUN MAIN
}