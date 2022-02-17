package `14_to_50`

//selain function kita juga bisa membuat extension untuk properties di kotlin
//untuk membuat extension properties kita bisa membuat properties dengan getter dan setter
//default standar dari extension function properties ini tidak dapat null
//jika ingin null pada extension function maka memerlukan tanda tanya (?)
class Student(var nama: String)

//extension properties tanpa menggunakan nullable
val Student.upperName: String//nama properties harus sama dengan nama classnya
    get() = this.nama.toUpperCase()

//extension properties ini juga dapat mendapat nullable
val Student?.lowerNama: String?
    get() = this?.nama?.toLowerCase()//penggunaan get sama seperti return,perbedaan nya return milik function sedankan get() milik variabel/properties

fun main(){
    val personSatu : Student= Student("pandu wijaya")
    println(personSatu.upperName)
    personSatu.nama = "MUHKITO"
    println(personSatu?.lowerNama)//extension function properties mendukung nullable
}