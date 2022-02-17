package `14_to_50`

import data.ValidationException

//FINALLY
//finaly adalah block kode yang bisa ditambahkan di try catch
//block finally akan selalu dieksekusi setelah kode program try catch di eksekusi,baik itu sukses atau gagal
//ini cocok untuk menempatkan kode yang memang harus dilakukan tidak peduli baik itu kode tryCatch nya sukses atau gagal
//FUNGSI DARI FINALLY BERFUNGSI UNTUK MENUTUP RUNTIME EROR YANG ADA,SEHINGGA TIDAK TERJADI PEMBENGKAKAN PADA APLIKASI

fun finally(name: String){
    if (name.isBlank()){
        throw ValidationException("Value is blank,can't continue")
    }else {
        println("Hay $name")
    }
}

fun main() {
    try {
        finally("Reza Darmawan")
        finally("")
    } catch (error: ValidationException){
        println("Terjadi Error ${error.message}")//apabila eror "Validation excaption",catch bagian ini yang menangkap
    } catch (error: NullPointerException){
        println("terjadi Error ${error.message}")//apabila eror "NullPointerExcaption",catch bagian ini yang menangkap
    } finally {
        println("Finally Always to executed")//finally selalu dieksekusi dalam segala kondisi,bahkan ketika terjadi eror pada NullPointerException sekalipun
    }
}