package data

//function overiding adalah kemampuan membuat/mendeklarasikan ulang function yg ada di class parent pada class dibawahnya
//perbedaan antara overriding dan inheritance adalah pada overiding kita dapat merubah isi pada body function
//sedangkan pada inheritance kita hanya mengikuti turunannya saja,tidak dapat melakukan perubahan
//agar fungsi dapat dibuat ulang di class lain maka memerlukan kata kunci open
//dan bagian yg di override menggunakan kata kunci "override"
//sedangkan agar fungsi di dalam class tidak dapat dibuat ulang maka menggunakan kata "final"

open class functionOveriding(val name: String) {
    open fun kendaraan(paramFirst: String, paramSecond: String){
        println("Mobil ini menggunakan transmisi $paramFirst dan meggunakan bahan bakar $paramSecond")
    }

}

//dalam penulisan child class boleh menggunakan parameter atau tidak
//semua harus sama termasuk constructor pada class dan paramater pada fungsi
//semua harus sama kecuali body dari function boleh beda

open class motor(name: String): functionOveriding(name){
    override fun  kendaraan(paramFirst: String, paramSecond: String){
        println("Motor ini menggunakan transmisi $paramFirst dan meggunakan bahan bakar $paramSecond")
    }
}

/**
 * cara kita untuk menghentikan overiding pada class dibawahnya,maka menggunakan final (final fun kendaraan) atau (final override fun kendaraan())
 */

//kita juga dapat mengambil inheritance secara berantai
//class motor mengambil inheritance dari function overiding,class extend mengambil dari class motor
class extend(name: String): motor(name){
    override fun kendaraan(paramFirst: String, paramSecond: String) {
        //super.kendaraan(paramFirst, paramSecond)
        //boleh kita hapus super.kendaraan()
        println("ini extend transmisi $paramFirst dan bahan bakar $paramSecond")
    }
}