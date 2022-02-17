package data2

//secondary constructor
//kotlin mendukung pembuatan constructor lebih dari satu buah
//letak dari secondary construtor berada di dalam body primary constructor
//constructor utama yang terdapat di class disebut sebagai primary constructor
//constructor tambahan yang bisa kita buat adalah secondary constructor
//saat membuat secondary constructor kita wajiba memanggil primary constructor jika ada primary constructor
//cara kita memanggil primary constructor menggunakan keyword "this"
//kelebihan pada secondary constructor adalah kita tidak perlu membuat intilizer block untuk menulis kode program

class JustData(para1: String,para2: String,para3: String?) {
    init {
        println("motor ini dibuat oleh $para1")
        println("this is a primary constructor")
    }

    //secndary constructor
    //fungsi dari secondary constructor adalah ketika kita hanya ingin menggunakan 2 constructor saja dari primary constrcutor
    //syarat pada parameter di primary constructor yang tidak ikut di deklarasikan pada secondary constructor wajib di inisialisasikan
    constructor(para1: String,para2: String): this(para1,para2,null){
        println("this is a secondary constructor first")
    }

    //kita dapat memiliki secondary constructor lebih dari satu
    //dengan syarat setiap turunannya harus berkurang satu parameternya
    constructor(para1: String): this(para1,""){
        println("this is a secondary constructor second")
    }
    
    val pertama: String = para1
    val kedua: String = para2
    val ketiga: String? = para3
}