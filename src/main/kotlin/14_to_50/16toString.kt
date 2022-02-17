package `14_to_50`

import data2.Usser

//toString() adalah sebuah function digunakan untuk memberitahu bentuk representasi String dari object
//Artinya merubah object yg kita buat kedalam bentuk string
//saat kita melakukan println object,sebenarnya function toString() yg akan dipanggil
//kita bisa meng overide function toString() jika ingin merubah representasi dari string pada object kita

fun main() {
    val user = Usser("doddy","12345")

    //cara println terdapat 2 cara
    println(user.toString())//secara eksplisit dengan menuliskan (user.toString())
    println(user)//secara langsung tanpa menuliskan (user.toString())
}