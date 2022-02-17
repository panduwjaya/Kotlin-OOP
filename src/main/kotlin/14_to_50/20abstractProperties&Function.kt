import data.Second
import data.first

//saat kita membuat class yg abstract,kita bisa membuat properties abstract dan function abstract di class tersebut
//artinya kita tidak bisa membuat abstract properties & function apabila class nya tidak abstract
//properties dan function yg bersifat abstract,artinya wajib dibuat ulang di class child nya
//di dalam class abstract kita tidak wajib/tidak boleh menginisilisasikan value dari abstract properties,jika dipaksakan akan eror
//di dalam class abstract kita tidak wajib/tidak boleh membuat body function dari abstract function,jika dipaksakan akan eror
//jika kita ingin menginisialisasikanya atau membuat body dari class harus pada class turunan dari class abstract
//tujuan dari abstract class adalah agar class turunannya dapat membuat properies yang sama dengan class abstract

fun main(){
    val firstObject = first()
    println(firstObject.name)
    firstObject.ujang()

    val secondObject = Second()
    secondObject.ujang()
}