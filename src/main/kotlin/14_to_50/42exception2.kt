package `14_to_50`

import data.ValidationException

//TRY CATCH
//jika dalam program kotlin kita terjadi exception maka secara otomatis program kita akan berhenti
//kadang kita tidak ingin sampai kejadian seperti itu (karena cukup berbahaya ketika program berhenti secara tiba-tiba ketika runtime)
//di kotlin kita bisa menangkap exception lalu melakukan sesuatu jika terjadi eror,hal itu disebut sebagai "try catch"
//try catch di kotlin digunakan untuk mencoba melakukan sesuatu,jika terjadi error maka akan ditangkap dan kita bisa memberi reaksi sesuai keinginan kita
//jadi notifikasi yang keluar bukan berupa exception strike tes lagi namun berupa pesan singkat,sesuai keinginan kita
//jadi try catch berfungsi membackup apabila terjadi eror

fun tryCatch(name: String){
    if (name.isBlank()){
        throw ValidationException("Name is blank,can't continue")
    }else {
        println("Hay $name")
    }
}

fun main() {
    try {//"try" berfungsi memberikan pengetesan,apabila terjadi permasalahan ketika pengetesan maka "catch" yang menyelesaikannya
        tryCatch("Pandu")
        tryCatch("")//program akan terhenti disini dan langsung dilanjutkan ke bagian catch
        println("hi ther i am here")//ini tidak muncul karena program telah terhenti pada tryCatch("")
    }catch(error: ValidationException){//tugas dari "catch" adalah menyelesaikan permasalahan error dari "try"
        println("Error with message ${error.message}")
    }
}