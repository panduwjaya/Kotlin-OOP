package `14_to_50`

import data2.Company

//di kotlin semua object bisa dibandingkan menggunakan operasi == atau !=
//saat kita membandingkan object menggunakan operasi == atau != sebenarnya kotlin menggunakan function equals milik class Any
//untuk mengubah membandingkannya,kita bisa men override function equals milik class any
//sebab secara standar equal function membandingkan suatu object berdasarkan memory

fun main() {
    val company1 = Company("Pandu")
    val company2 = Company("Pandu")

    println(company2 == company2)//hasilnya akan tetap true walapun belum mendapat modifikasi tambahan,karena lokasi memorinya sama
    println(company1 == company2)//hasilnya false,apabila belum terdapat modifikasi tambahan pada class
}