package data

//super keyword adalah keyword ketika kita ingin mengakses function atau properties milik class parent,baik berupa function maupun properties biasa
//fungsi nya adalah untuk mengambil value/isi atau behave dari properties pada parent class
//kita bisa menggunakan keyword "super"
//kita hanya dapat mengakses satu parent class diatas class pengakses,artinya tidak berlaku chain super

//super properties & super function
open class superKeyword {
    open val corner: Int = -1
    open val sentence: String = "Ini adalah hasil turunan dari properties sentence"
    open fun printNama(){
        println("ini adalah fungsi nama sebelum di overide")
    }
}

class shape1: superKeyword(){
    override val corner: Int = 4
    //dengan keyword super kita dapat mengakses properties corner pada parent class
    val parentCorner: Int = super.corner //super properties,yg berarti kita dapat mengambil value dari properties class parent
    val superSentence: String = super.sentence//mengakses properties sentence pada class superkeyword

    override fun printNama() {
        println("ini adalah fungsi nama setelah di override")
        super.printNama() //ini adalah super function
    }
}