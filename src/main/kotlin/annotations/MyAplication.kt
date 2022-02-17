package annotations

import annotations.fancy

//anotation adalah menambahkan metadata ke kode program yang kita buat
//tidak semua orang membutuhkan anotation biasanya anotation digunakan saat kita ingin membuat library/framework
//jika kita tidak ingin membuat library maka tidak memerlukan anotation
//anotation sendiri bisa diakses menggunakan reflection
//reflection merupakan mengambil data informasi sedang berjalan atau RUNTIME
//Untuk membuat class anotation,kita bisa menggunakan kata kunci annotation sebelum membuat class
//anotation hanya boleh memiliki properties via primary constructor,tidak boleh meiliki member lain
//member lain seperti function atau properties di body

//atribute annotation
/**
 * @target = memberitahu anotaion bisa digunakan,pada class function properties atau yang lain-lain
 * @retention = memberitahu annotation apakah disimpan di hasil kompilasi dan apakan bisa dibaca oleh reflection/RUNTIME
 * @repeatable = memberitahu annotation apakah bisa digunakan lebih dari sekali target yang sama
 * @mustbedocumented = memberitahu annotation apakah perlu di dokumentasi di public API
 */
@fancy(author = "joko")
class MyAplication(val name: String, val version: Int){
    fun info():String = "nama dari aplikasi $name dan versi $version"
}