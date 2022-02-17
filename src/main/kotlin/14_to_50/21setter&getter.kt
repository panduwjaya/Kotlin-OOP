package `14_to_50`

//getter adalah function yang dibuat untuk mengambil data properties
//setter adalah function untuk mengubah data properties
//ketika menggunakan var kita dapat menggunakan getter dan setter
//tetapi jika menggunakan val kita hanya dapat menggunakan getter tanpa setter
//karena value dari val tidak dapat diubah

//INFORMASI TAMBAHAN:
//kita bisa mendeklarasikan hanya salah satunya yaitu getter atau hanya setter saja

class Note(title: String){
    var title: String = title
        get(){
            println("call getter function")
            return field//field itu adalah pengganti properties yg dituju pada class,jadi field == title
        }
        set(value){
            println("call setter function")
            if(value.isNotBlank()){
                field = value
            } else{
                println("invalid funcion")
            }
        }
}

//penggunaan setter tanpa getter
//tidak dapat menggunakan setter karena pada properties terebut bernilai val
class UpperNote(val title: String){
    val bigtitle: String
        get() = title.toUpperCase()
}


fun main(){
    //ketika nilai dari suatu fungsi tidak diubah melainkan diinisilisasikan terlebih dahulu
    //maka yang akan dipanggil adalah getter
    val note = Note("Mulai bahasa kotlin")
    println(note.title)

    //ketika nilai dari suatu fungsi diubah ulang maka yg dipanggil adalah setter
    note.title = "badak sumbu"
    println(note.title)

    //ketika nilai suatu fungsi diubah ulang maka dengan value kosong
    //maka yang akan muncul adalah println("invalid function")
    note.title = ""
    println(note.title)

    //penggunaan yang hanya menggunakan getter tanpa setter
    val bigNote = UpperNote("this is upperNote")
    println(bigNote.title)//ini akan berbentuk bukan uppercase karena,value yang diambil langsung berasal dari constructor
    println(bigNote.bigtitle) //ini akan berbentuk uppercase
}