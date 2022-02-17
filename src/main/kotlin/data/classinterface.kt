package data

//interface semacam blue print atau cetakan pada kotlin
//interface dapat dikatakan sebagai parent dari class
//berbeda dengan class,interface tidak bisa langsung dibuat sebagai object
//interface dapat mewarisi/melakukan kontrak kepada class,namun class tidak dapat mewarisi kepada interface.
//setiap isi dari interface harus di deklarasikan semua tanpa terkecuali,agar tidak terjadi eror
//interface dapat menjadi parent class doubel berbeda dengan class yang tidak bisa menjadi doubel parent class
//interface mirip dengan abstract class jadi tidak bisa dibuat lgsg sebagai object
/**perbedaan antara abstract class dan interface adalah:
 * ada abstract class kita harus memberi tambahan kata "abstract" pada function dan properties yg kita buat di dalam body abstract class
 * sedangkan pada abstract class mewajibkan menggunakan keyword "interface" pada function dan properties yg kita buat di dalam body abstract class
 * karena secara standar,semua properties dan function adalah abstract jadi kita,tidak perlu menuliskan keyword "interface" di depan properties/function
 * interface tidak memiliki costructor seperti halnya class
 * pada interface dapat menerapkan multiple intheritance,artinya sebuah class dapat menerima 2 turunan sekaligus dari interface yg berbeda
 */

interface Interaction {
    val nama: String //kita tidak boleh menginisialisasi lgsg pada properties
    fun example(name: String) //kita dapat membuat body fungsi lgsg pada interface
    fun exampleSecond(named: String){//ini merupakan contoh concrete function di interface,artinya lgsg membuat body dari function di interface
        println("ini adalah interface biasa,$named")
    }//jika sudah membuat concrete function kita tidak wajib mendeklarasikan ulang function ini pada class turunan dari interface ini
}

//pada interface memiliki kelebihan yaitu,bisa memiliki 2 class parent sekaligus
//berbeda dengan anonymous function dan class turunan lainnya yg hanya bisa memiliki 1 class parent
interface Go{
    val nama: String
    fun go(){
        println("ini adalah interface kedua")
    }
}

interface GoRossi{
    val nama2: String
    fun goo(named: String)
}

open class Contoh{

}

//kita dapat menggunakan body pada class
class firstPerson(override val nama: String): Interaction{
    override fun example(name : String){
        println("perkenalkan ini adalah $name dan ${this.nama}")
    }
}

//multiple inheritance
//artinya class child dapat menerima 2 turunan sekaligus dari interface yg berbeda
//namun untuk class turunan dari class biasa hanya dapat menerima 1 turunan parent class dari class biasa
class SecondPerson(override val nama: String, override val nama2: String): Contoh(),Go, GoRossi{
    override fun go() {
        println("ini adalah multiple inheritance 1")
    }

    override fun goo(named: String) {
        println("ini adalah multiple inheritance 2")
    }
}