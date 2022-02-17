package data2

class Usser(val username: String,val password: String) {

    //kita dapat men overide function toString yg berasal dari class any
    //apabila kita menghapus overide dari class to string,ketika kita men print class ini yang muncul adalah kode-kode alokasi memori
    override fun toString(): String {
        return "user with username=$username and password=$password"
    }
}