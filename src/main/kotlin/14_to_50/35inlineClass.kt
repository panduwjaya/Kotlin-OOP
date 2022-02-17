package `14_to_50`

//inline class
//terlalu banyak membuat class akan memakan banyak konsumsi memory
//kotlin terdapat kemampuan untuk mengubah class menjadi inline dengan menggunakan kata kunci "inline"
//syarat penggunaan class adalah properties dari class hanya satu tidak boleh lebih

/**TUJUAN DARI PENGGUNAAN INLINE CLASS:
 * JIKA KITA MEMILIKI CLASS DENGAN SATU PROPERTIES DALAM JUMLAH BANYAK TENTU AKAN MEMAKAN BANYAK MEMORI DAN KURANG EFISIEN
 * CLASS YANG MEMILIKI SATU PROPERTIES TERSEBUT AKAN DIUBAH MENJADI STRING BIASA DENGAN INLINE CLASS
 * DENGAN BEGITU MAKA PROGRAM AKAN BERJALAN LEBIH RINGAN
 * kelebihan menggunakan inline class adalah merubah class menjadi string biasa
 * jika tidak menggunakan inline maka sebuah class akan dibaca sebagai class biasa
 */

import data.InlineClass

fun main() {
    val objek1 = InlineClass("hasil upper dari inline class")
    println(objek1.contain)
    println(objek1.toUpper())
}
