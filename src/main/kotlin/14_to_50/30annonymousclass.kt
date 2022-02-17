package `14_to_50`

//saat kita ingin membuat object maka kita diwajibkan untuk menggunakan deklarasi class secara lengkap
//kotlin mendukung pembuatan object dari class yang bahkan belum lengkap,menggunakan anonymous class
//contoh class yg belum lengkap seperti: interface ataupun abstract class
//bahkan,kita membuat object dari interface ataupun abstract class
//kemampuan tersebut disebut sebagai anonymous class
//anonymous class berfungsi ketika kita ingin mendeklarasikan isi properties pada class dalam jumlah kecil
//untuk membuat anonymous class,kita bisa menggunakan kata kunci "object",diikuti dengan deklarasi class child seperti pada inheritance
//kita dapat menggunakan class child dibawahnya

interface Action {
     fun action()
}

//tipe data terbagi atas 2 jenis yaitu primitive dan non primitive
//tipe data primitive yaitu: Int,String,boolean dll
//tipe data non primtive yaitu: class,interface dan function dll
fun fireAction(action: Action){//ini merupakan contoh penggunaan tipe data non primitive
    action.action()
}

class SampleAction: Action{
    override fun action() {
        println("ini tidak menggunakan annonymous class")
    }
}

fun main(){
    fireAction(SampleAction())//contoh tanpa anonymous class,masih menggunakan bantuan class SampleAction
    fireAction(object: Action{//ini contoh anonymous class,tanpa menggunakan bantuan class SampleAction,tetapi menggunakan fun fireAction
        override fun action() = println("Anonymous class 1")
    })
    fireAction(object: Action{
        override fun action() = println("Anonymous class 2")
    })
    //KELEBIHAN ANONNYMOUS CLASS:
    //Annonymous class tidak perlu mendklarasikan class terlebih dahulu sebagai penampungan sementara properties dari interface/abstract
    //kita dapat langsung membuat object dari interface/abstract,tanpa membuat class terlebih dahulu cukup menggunakan annonymous class atau class yg belum lengkap
    //Annonymous class tidak memerlukan nama,seperti class pada umumnya
    //Annonymous class cocok untuk digunakan sekali pakai,artinya 1 data,1 annonymous class
    //walaupun tidak menggunakan bantuan class pada annonymous class,tetapi digantikan menggunakan bantuan function seperti function fireAction
}