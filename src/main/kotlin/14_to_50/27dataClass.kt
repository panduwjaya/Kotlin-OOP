package `14_to_50`

//Data class merupakan class yang bertujuan untuk menyimpan data
//Data class berfungsi untuk membuatkan function equals,hascode dan toString secara otomatis
//cara membuat data class cukup dengan menambahkan keyword "data" di depan kata class
//Pada Data class juga terdapat function copy yg berarti kita dapat mencopy semua properties yg terdapat di primary constructor pada data class
/**
 * FUNGSI DARI DATA CLASS ADALAH:
 * PADA DATA CLASS SECARA OTOMATIS TERDAPAT equals(),hashCode() dan toString()
 * KITA DAPAT MENCOPY ISI PROPERTIES DARI CLASS LAIN DENGAN MENGGUNAKAN copy()
 * TERDAPAT componentX() FUNGSI YANG SESUAI DENGAN PROPERTI DALAM URUTAN DEKLARASI MEREKA
 * TIDAK PERLU MANUAL DALAM PENULISAN PROPERTIES PADA CLASS
 */


//TIDAK MENGGUNAKAN DATA CLASS
class Product1(val name: String,
               val price: Int,
               val category: String)//kekurangan jika tidak menggunakan data class adalah,dalam melakukan penulisan pada object harus manual

//secara otomatis data class dibawah ini lgsg dibuat equal,hascode dan toString nya
data class Product(val nameOfProduct: String, val price: Int,val categoryOfProduct: String)

fun main(){
    //contoh yg tidak menggunakan data class
    val product1 = Product1("Sarden ABC",5000,"Frozen Food")
    println(product1)//hasilnya masih berupa alokasi memori "14_to_50.Product1@7cca494b"

    //syarat agar dapat dibuatkan secara otomatis named argument pada parameter adalah kita wajib memasukan semua atribut properties kedalam primary constructor
    val product2 = Product("Supermie", 2500,"noodle")
    println(product2)//hasilnya "product(nameOfProduct=supermie, price=2500, categoryOfProduct=noodle)"

    //kita juga dapat menggunakan fitur copy pada object dari data class
    //kita dapat meniru segala yg ada termasuk hingga isi dari propertiesnya
    //kita juga dapat mengganti data yg ada di properties sebelumnya
    val product3 = product2.copy("Sarimie")
    println(product3)//hasilnya "Product(nameOfProduct=Sarimie, price=2500, categoryOfProduct=noodle)"
}