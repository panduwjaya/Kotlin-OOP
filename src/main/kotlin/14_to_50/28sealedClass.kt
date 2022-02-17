package `14_to_50`

//sealed class merupakan jenis class untuk inheritance
//sealed class sama seperti abstract class yaitu tidak dapat dibentuk sebagai object
/**FUNGSI DARI SEALED CLASS ADALH BERFUNGSI UNTUK MENYIMPAN RUMUS/PERHITUNGAN DALAM JUMLAH BANYAK
 * SEALED CLASS MAMPU MEMERIKSA SETIAP CHILD CLASS TURUNAN DARI SEALED CLASS
 * SEHINGGA MENGHINDARI KETELEDORAN/KEKOSONGAN DALAM PENDEKLARASIAN CHILD CLASS FUNCTION
 * MEMPERMUDAH DALAM PENGISIAN VALUE
 */

/**PERBEDAAN ANTARA SEALED CLASS DENGAN ABSTRACT CLASS
 * sealed class sangat cocok jika digabungkan dengan when sebagai batas pengecekan
 * dengan menggunakan sealed class,kita bisa membatasi hanya class turunan dari sealed class yg perlu di check secara teliti untuk menghindari kekosongan
 */

sealed class Operation(val paramA: String)
//kita dapat melakukan turunan dari class Objek1 kepada class child
//class DefrensialObjek1: Objek1("subejct 1")
//class DefrensialObjek2: Objek1("subject 2")
class Sum: Operation("penjumlahan")
class Multiplication: Operation("perkalian")

//ketika salah satu class turunan dari class sealed tidak ditulis maka when akan memberikan peringatan
//when akan memeriksa ketika ada salah satu fungsi yang blm ditulis pada fungsi process maka diberikan warning
//function yg digunakan pada sealed class,harus lah return function
fun process(paramA2: Int, paramB2: Int, object1: Operation): Int{//objek1: Objek1 merupakan pendeklarasian sealed class pada parameter
    //object1 berfungsi sebagai pengecekan bahwa sub class/child class yg dimiliki sealed class Operation terdapat 2 yaitu sum dan Multiplication
    return when (object1){
        is Sum -> paramA2 + paramB2
        is Multiplication -> paramA2 * paramA2
    }
}

fun main(){
    val object1 = Sum()
    println(object1.paramA)
    val object2 = Multiplication()
    println(object2.paramA)

    //hasil dari penjumlahan dan perkalian dari sub unit sealed class
    println(process(20, 20, Sum()))
    println(process(20, 20, Multiplication()))
}