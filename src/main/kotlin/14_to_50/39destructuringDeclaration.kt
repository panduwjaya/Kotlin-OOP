package `14_to_50`

import data2.Apps
import data2.Game

//destructuring declaration adalah membuat multiple variable dari sebuah object
//destructuring tidak bisa dilakukan untuk semua object,hanya object yang memiliki function componentX() yang bisa dilakukan destructuring
//saat kita membuat data class secara otomatis akan dibuatkan function componentX() sesuai dengan jumlah parameternya

/**FUNGSI DARI DESTRUCTURING DECLARATION ADALAH:
 * AGAR MEMPERMUDAH KITA DALAM MENAMPILKAN DATA CONSTRUCTOR DI CLASS
 * MEMPERMUDAH KITA DALAM MENAMPILKAN DATA DALAM JUMLAH BANYAK PADA CONSTRUCTOR DI CLASS
 */

fun main() {
    val first = Game("Lost Saga",2021)//menggunakan destructuring manual,artinya tidak menggunakan data class
    val (nameProduct, price) = first //MEMBUAT MULTIPLE VARIABEL DARI OBJECT "first" YG SUDAH ADA,yang mana berasal dari function componentX()
    println(nameProduct)
    println(price)

    val second = Apps("Whatsapp",2012)//menggunakan destructuring otomatis
    val (nameApps, releaseDate) = second //MEMBUAT MULTIPLE VARIABEL DARI OBJECT "second" YG SUDAH ADA,yang mana berasal dari function componentX()
    println(nameApps)
    println(releaseDate)

    val (min, max) = minMax(20,10)//DESTRUCTURING DI FUNCTION
    println(min)
    println(max)

    //KETIKA KITA INGIN MELAKUKAN DESTRUCTURING PADA SALAH SATU VARIABEL SAJA DAN MENGHIRAUKAN VARIABEL LAINNYA
    //KITA DAPAT MENGGUNAKAN KATA (_) ATAU UNDERSCORE
    val (minus, _) = minMax(20,10)
    println(minus)


}

//DESTRUCTURING DI FUNCITON
//DESTRUCTURING DECLARATION JUGA BISA DILAKUKAN KETIKA MEMANGGIL FUNCTION
//DENGAN INI SEAKAN-AKAN KITA BISA MENGEMBALIKAN MULTIPLE RETURN VALUE PADA FUNCTION
//JADI KITA BISA MENGEMBALIKAN LEBIH DARI SATU RETURN VALUE

data class MinMax(val min: Int, val max: Int)
fun minMax(value: Int, value2: Int): MinMax{//DENGAN DUKUNGAN RETURN VALUE BERUPA DATA CLASS,YANG MEMUNGKINKAN MELAKUKAN MULTIPLE RETURN VALUE
    return when {
        value < value2 -> MinMax(value,value2)
        else -> MinMax(value2,value)
    }
}