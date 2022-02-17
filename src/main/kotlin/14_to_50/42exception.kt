package `14_to_50`

import data.ValidationException

//VALIDATION EXCEPTION
//saat membuat program kita pasti akan selalu berhadapan dengan eror
//banyak sekali jenis eror,baik itu eror yang sudah diduga seperti validatiion eror,atau eror yg tidak terduga seperti jaringan eror,koneksi database eror dll
//eror di kotlin direpresntasikan dengan exception dimana semua tipe data eror pasti akan selalu class turunan dari throwable
//untuk membuat eror di kotlin sangatlah mudah,kita bisa menggunakan kata kunci throw diikuti dengan object errornya
//dengan adanya penggunaan validation exception eror yang ada akan direpresntasikan dalam bentuk exception strike test

fun validation(name: String){
    if (name.isBlank()){
        throw ValidationException("Name is blank,can't continue")//kita dapat menentukan message eror kita sendiri
    }else {
        println("Hay $name")
    }
}

fun main() {
    validation("eko")
    validation("")//akan muncul ("Name is blank,can't continue")
}