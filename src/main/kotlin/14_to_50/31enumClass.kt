package `14_to_50`

//enum class hampir mirip seperti data class yaitu sebagai class tempat penyimpanan data
//yang membedakan adalah pada enum class data yang disimpan berupa data baku sedangkan pada data class data yang masih dapat berubah-ubah
//data class dapat langsung dibuat kedalam object sedangkan enum class tidak bisa
//enum class merupakan representasi dari class yang sudah tetap nilainya
/**biasanya enum class digunakan untuk jenis data yang sudah baku seperti
 * jenis kelamin
 * arah mata angin
 * kiri dan kanan
 */
//kita tidak bisa membuat object dari class enum,namun kita bisa mendeklarasikan langsung object yg tersedia untuk class enum tersebut

//============= ENUM CLASS BIASA ================
//untuk membuat enum class kita bisa menggunakan kata kunci "enum" sebelum mendeklarasikan classnya
enum class Gender{
    MALE,FEMALE//male dan female bukanlah properties melainkan data pada enum class
    //jadi ketika kita membuat object terdapat 2 pilihan data,yaitu MALE ATAU FEMALE
}

//======== ENUM CLASS DENGAN TAMBAHAN PROPERTIES DAN FUNCTION ==========
//enum class adalah class seperti biasa pada umumnya
//enum class bisa memiliki properties ataupun function
//namun jika propertiesnya di set menggunakan constructor maka saat pembuatan object enum wajib diisi
//dan jika terdapat abstract function wajib di override pada saat pembuatan object enum
enum class cuaca(val description: String){
    //atribut dari properties pada enum class
    //selalu akhiri dengan ";" pada atribut jika menggunakan functiion
    PANAS("musim panas"),//constructor pada properties wajib diisi
    HUJAN("musim hujan");

    fun showDescription(){
        println(description)
    }
}


fun main(){
    /**kita tidak bisa membuat object dari class enum
     * namun kita bisa mendeklarasikan langsung object yang tersedia untuk class enum tersebut
     */
    val man = Gender.MALE//kita tidak perlu menulis seperti (val man = Gender()) cukup (val man = Gender.MALE)
    val woman = Gender.FEMALE

    //cara kita mengambil semua kombinasi data pada enum class
    //values itu berfungsi mengembalikan array<Gender> atau array of gender
    //array<gender> merupakan data array yang berisi semua data enum class gender
    val allgender = Gender.values()

    println(man)//mencetak hasil dari object man
    println(woman)//mencetak hasil dari object woman

    //yang muncul pada output adalah memory address
    //karena isi dari variabel tersebut masih berupa array
    println(allgender)//hasilnya berupa memory ([L14_to_50.Gender;@776ec8df)

    //ini hasil konversi dari array
    //yang hasil output nya berupa isi value dari arrary allgender
    println(allgender.toList())//dengan adanya function toList() akan mengubah yg tadinya berbentuk memory kedalam bentuk list item

    //========================= KONVERSI STRING =========================
    //cara menkonversi object dari "MALE" atau "FEMALE" ke dalam bentuk string
    val manFromString = Gender.valueOf("MALE")//PENULISAN VALUE HARUS SAMA DENGAN NAMA DATA PADA ENUM CLASS
    val womanFromString = Gender.valueOf("FEMALE")//PENULISAN VALUE HARUS SAMA DENGAN NAMA DATA PADA ENUM CLASS

    //======== MENAMPILKAN HASIL DARI PROPERTIES DAN FUNCTION PADA ENUM CLASS ======
    val hujan = cuaca.HUJAN
    val panas = cuaca.PANAS

    println(hujan)//hasil = "HUJAN"
    println(panas)//hasil = "PANAS"

    hujan.showDescription()//hasil = "musim hujan"
    panas.showDescription()//hasil = "musim panas"

}