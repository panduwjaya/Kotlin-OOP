package data

//kotlin mendukung deklarasi properties langsung di primary constructor
//ini sangat berguna untuk mempersingkat saat kita ingin membuat properties dan mengisi datanya lewat contructor
//dengan ini kita tidak perlu menuliskan properties pada class
//untuk permasalahan val atau var tidak berpengaruh jika valuenya tidak di deklarasikan terlebih dahulu di dalam class
//untuk permasalahan val atau var tidak berpengaruh selama hasil dari pengisian data di dalam primary constractor tidak dirubah lagi
//properties constractor tidak dapat di deklarasikan di dalam secondary constructor

class propertiesConstractor(val paraName: String, val paralastName: String) {
    init {
        println("nama lengkap $paraName $paralastName")
    }
}