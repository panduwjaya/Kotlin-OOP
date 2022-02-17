package data2

//INI MERUPAKAN DESTRUCTURING DECLARATION MANUAL,APABILA TIDAK MENGGUNAKAN DATA CLASS
//KITA HARUS MENULIS "componentx()" sebanyak destructuring variabel yg kita buat
//SETIAP DATA CLASS SELALU MEMILIKI COMPONENTx()

/**FUNGSI DESTRUCTURING DECLARATION
 * MEMBUAT MULTIPLE VARIABEL DARI OBJECT YG SUDAH ADA
 */

class Game(val nameProduct: String, val price: Int){//DESTRUCTURING DECLARATION MANUAL
    operator fun component1(): String = nameProduct
    operator fun component2(): Int = price
}

data class Apps(val nameApps: String, val releaseDate: Int){//DESTRUCTURING DECLARATION OTOMATIS MENGGUNAKAN "DATA CLASS"
}

/**DESTRUCTURING LAMBDA PARAMETER
 * DESTRUCTURING JUGA BISA DILAKUKAN DI LAMBDA PARAMETER
 * HAL INI BISA MEMPERMUDAH KITA SAAT INGIN MENGAKSES DATA YG ADA DI PARAMETER
 */

//data class login(val user: String,val password: String)
//typealias loginCallback = (login) -> Boolean
//
//fun login(login: login,callback: LoginCallback): Boolean{
//    return callback(login)
//}