package data

//inheritance kemampuan menurunkan sifat/behave class ke class lain
//secara analogi adalah class parent dan class child
//hanya bisa menggunakan satu class parent
//dari satu class parent dapat menghasilkan banyak class child

open class Inheritance (val name: String){
    fun helloGoodBye(name: String){
        println("Selamat tinggal $name ${this.name}")
    }
}

//apabila class utama tidak memiliki constructor maka tidak wajib meng extend constructor dari class utama ke class turunan nya
//dengan adanya class turunan kita dapat mengakses behave apapun pada primary class terhadap class turunan
class Person1(nama: String): Inheritance(nama)//inheritance pertama
class Person2(firstName: String): Inheritance(firstName)//inheritance kedua