package `14_to_50`

import data.Handphone
import data.Laptop
import data.SmartPhone

//dalam OOP kita sering bertemu dengan banyak tipe data(class) dan inherintace
//serta butuh melakukan pengecekan tipe data atau bahkan melakukan konversi data

fun printObject(any: Any){//dengan parameter any kita dapat memasukan data apapun (int,string,bahkan class)
    println(any)//println mendukung any sebagai parameternya
}

fun main() {
    printObject("eko")//any dapat menerima string
    printObject(1)//any dapat menerima int
    printObject(Laptop("acer"))//any dapat menerima class
    printObject(SmartPhone("Samsung","Android 10"))//any dapat menerima inheritance class
    //SMARTCAST
    printObjectWithSmart(Laptop("acer"))
    printObjectWithSmart(Handphone("Nokia"))
    printObjectWithSmart("Samsung")
    //unsafe
    unsafeCasts("Pandu")
    //unsafeCasts(15) = pasti ClassCastException
    safeNullableCasts("Pandu Wijaya")
    safeNullableCasts(15)//akan diubah menjadi null
}

//is digunakan untuk melakukan pengecekan apakah sebuah data merupakan tipe data tertentu
//!is digunakan untuk melakukan pengecekan apakah sebuah data bukan merupakan tipe data tertentu
//menggunakan smartcast
fun printObjectWithSmart(any: Any) {
    if (any is Laptop) {
        println("laptop ${any.name}")
    } else if (any is Handphone) {
        println("handphone ${any.name}")
    }else{
        println(any)
    }
}

fun printObjectWithWhen(any: Any){
    //penggunaan when pada smartcast
    when (any) {
        is Laptop -> println("laptop ${any.name}")
        is Handphone -> println("handphone ${any.name}")
        else -> println(any)
    }
}

//kotlin juga mendukung konversi tipe data secara paksa menggunakan kata kunci as
//namun konversi menggunakan as sangat tidak aman jika ternyata tipe datanya tidak sesuai
//jika tidak sesuai maka akan terjadi CastsClassexception
fun unsafeCasts(any: Any){
    val value = any as String
    println(value)
}

//safe nullable casts
//penggunaan as sangat tidak aman namun,dapat dijadikan safe menggunakan (as?)
//dengan menggunakan kata kunci (as?) secara otomatis jika gagal melakukan konversi,akan diubah menjadi null
fun safeNullableCasts(any: Any){
    val value : String? = any as? String
    println(value)
}