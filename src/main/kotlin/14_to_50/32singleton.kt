package `14_to_50`
//kita membahas tentang singleton obejct
//singelton tidak memiliki constructor

import data.singletonObject
import data.InnerObject


fun main() {
    //untuk mengakses singleton object tidak memerlukan bantuan object
    //cukup println,lalu masukan nama singleton object kemudian dikuti titik(.),lalu masukan nama properties
    println(singletonObject.title)//mengakses properties
    println(singletonObject.singgletonUpper("upper"))//mengakses function pada singleton object

    //ketika singelton object menggunakan var,kita dapat merubah valuenya
    singletonObject.change = "ini dirubah"
    a()//mengakses hasil dari singletonObject.change
    b()//mengakses hasil dari singletonObject.change

    //mengakses innerObject
    println(InnerObject.ObjectInner.functionObject("LOWWER"))
}



//=====================PERBEDAAN SINGLETON OBJECT DENGAN CLASS BIASA==========================

//pada singleton object apabila terjadi perubahan inisilisasi pada fun main maka akan berubah semua,maka inisilisasinya pada class sebelumnya tidak berlaku
//maka hasil dari fun a dan b,adalah "ini dirubah"
//hal itu dapat terjadi karena singleton hanya dibuat satu kali,jadi bukan berupa blueprint seperti pada class
//maka dari itu saat penggunaan singleton object disarankan menggunakan imutable atau val

fun a(){
    //singletonObject.change = "change 2" <- ini hasil inisilisasi pada fun a()
    // jika kita menginisilisasi properties pada fun a(),maka hasil inisilisasi itu juga akan berpengaruh pada fun b()
    //maka dari itu singleton object dikatakan sebagai object yang hanya dapat dibuat sebanyak 1 kali
    println(singletonObject.change)
}

fun b(){
    println(singletonObject.change)
}