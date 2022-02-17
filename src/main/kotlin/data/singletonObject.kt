package data

//singleton object
//salah satu konsep design pattern yg sangat populer adalah singleton object
//singleton object adalah object yang hanya dapat dibuat satu kali
//cara membuat singleton hanya menggunakan kata kunci "object"
//singelton object mirip dengan class,bisa extend class ataupun interface
//singleton object tidak memiliki constructor,biasanya orang-orang membuat singleton object untuk hyperclass ataupun utility class

object singletonObject {
    val title = "Belajar Singleton Object"
    var change = "Ini belum Berubah"//karena menggunakan var

    fun singgletonUpper(contain: String): String{
        return contain.toUpperCase()
    }
}