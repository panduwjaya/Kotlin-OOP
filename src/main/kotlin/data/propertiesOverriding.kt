package data

//properties overiding adalah menurunkan properties dari class parent ke class child
//semua harus sama,yg boleh beda hanya isi dari properties itu sendiri dan nama dari class yang meng overide

open class propertiesOverriding {
    open val corner: Int = 1
}

open class propertiesFirst : propertiesOverriding() {
    //ketika sudah menggunakan override kita tidak memerlukan keyword "open" lagi
    //yanh menggunakan kata kunci open adalah pada class yg di override
    override val corner: Int = -1
}

//mendukung chain overriding
class propertiesSecond : propertiesFirst() {
    //agar properties tidak dapat di overide oleh class dibawahnya maka dapat menggunakan keyword "final"
    final override val corner: Int = -4
}