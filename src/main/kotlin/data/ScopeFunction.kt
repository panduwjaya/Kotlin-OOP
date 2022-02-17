package data

//kotlin memiliki standar library yang berisi function untuk mengeksekusi object memanfaatkan lambda expresion
//function-funtion tersebut adalah let,run,apply dan expresion

//let function
//let function bisa digunakan sebagai reference block agar bisa lebih mudah ketika ingin memanipulasi sebuah object
//let function memiliki parameter object itu sendiri,kita bisa menggunakan kata kunci it untuk memperoleh reference dari object itu

//run function
//run function mirip dengan let function
//yang membedakan adalah,pada run function tidak ada parameter pada lambdanya,sehingga kita tidak bisa mengakses
//reference object menggunakan kata kunci it.namun kita bisa menggunakan kata kunci this

//apply function
//apply function mirip dengan run function
//yang membedakan adalah return value dari apply function adalah reference object itu sendiri
//jika pada let dan run function kita bisa return function nya dapat berupa return String,sedangkan pada apply object itu sendiri

//also function
//also function mirip dengan let function
//yang membedakan adalah pada also function,return valuenya adalah reference ke objec itu sendiri
//artinya return nya merupakan object itu sendiri

//with function
//with function mirip dengan run function,menggunakan reference this
//yang membedakan adalah,with function bukanlah extension function jadi tidak bisa digunakan lansung dari objectnya
//kita harus memanggil with function secara manual
//hasil return value nya sesuai dengan lambda semisal string maka returnnya juga string

class ScopeFunction (val name: String, val age: Int){
    fun personalStudent(){
        println("Nama saya adalah ${this.name} dan saya berusia ${this.age}")
    }
}