package `14_to_50`

import data.ValidationException

//MULTIPLE CATCH
//saat kita mengeksekusi sebuah kode program di blok try,bisa dimungkinkan tidak hanya terjadi satu jenis exception,namun beberapa jenis exception
//kita bisa menggunakan multiple block catch untuk menangkap jenis exception yang berbeda
fun multiple(name: String){
    if (name.isBlank()){
        throw ValidationException("Value is blank,can't continue")
    }else {
        println("Hay $name")
    }
}

fun main() {
    try {
        multiple("Rizki Darmawan")
        multiple("")
    } catch (error: ValidationException){
        println("Terjadi Error ${error.message}")//apabila eror "Validation excaption",catch bagian ini yang menangkap
    } catch (error: NullPointerException){
        println("terjadi Error ${error.message}")//apabila eror "NullPointerExcaption",catch bagian ini yang menangkap
    }
}