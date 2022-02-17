package `14_to_50`

//tidak hanya tipe data namun class juga dapat dibuat extension function
//extension function pada class tidak dapat merubah isi dari class itu sendiri
//ketika ada suatu parameter dari class tersebut bersifat private maka paramter itu tdk dapat diakeses oleh extension
/**extension bukanlah function di class
 * perlu diperhatikan bahwa saat membuat extension function kita tidak memodifikasi class aslinya
 * extension function hanyalah sebuah function bantuan yg artinya,kita tidak bisa mengakses data private atau protected dari class tersebut
 * nama function harus dengan nama class,yang membedakan hanyalah nama extensionnya saja
 * penggunaannya mirip dengan extension function pada kotlin dasar,yaitu bersifat magic
 */

//ketika suatu parameter benilai private maka parameter tsb tidak dirubah menjadi public pada fungsi
class noll(val nol: String, private val satu: String){
    fun noll.contohOne(nama: String){
        println("nama ku $nama dan umur ku ${this.satu}")//ini eror karena private
    }
}

//class dari extension function dengan null,maka kita wajib memberikan tanda tanya (?)
class WithNull(val satu: String, val dua: String)

//INI ADALAH NULLABLE EXTENSION FUNCTION
fun WithNull?.contohTwo(tiga: String) {
    //jika menggunakan if maka secara otomatis kotlin dapat menganilisis dengan cepat yang disebut sebagai smartcast pada kotlin
    if (this != null) {
        println("ini adalah fungsi menggunakan nullable: halo saya $tiga,dan ini adalah ${this.satu} ${this.dua}")
    }
}

//INI ADALAH CONTOH EXTENSION FUNCTION NULLABLE TANPA MENGGUNAKAN IF
class GoodStudent(val nama: String)

//extension function SUPPORT NULLABLE
fun GoodStudent?.upperNama(ParamNama : String): String{
    return ParamNama.toUpperCase()
}

//setip menuliskan extension function pada class sebaiknya diletakan diluar body class
class Pertama(val nama: String, val lastName: String)

fun Pertama.objectOne(namaDua: String){
    println("hallo $namaDua nama saya ${this.nama} ${this.lastName}")
}

fun main(){
    val contoh1 = Pertama("Alvin", "Reihansyah")
    contoh1.objectOne("Ujang")

    val contoh2 = WithNull("Pandu","Wijaya")
    contoh2.contohTwo("Bintang")

    val contoh3: GoodStudent? = GoodStudent("")//contoh penggunaan null pada extension function tanpa if operator
    println(contoh3.upperNama("Pandu"))
}