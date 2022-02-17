package `14_to_50`

//inheritance antar interface
//tidak hanya class yg punya kemampuan inheritance
//interface juga bisa melakukan inheritance dengan interface lain
//namun interface tidak bisa melakukan inheritance dengan class

interface InheritanceInterface {
    val nama: String
    fun example(name: String)
}

interface SecondInheritance: InheritanceInterface{
    val name: String
    fun go(){
        println("ini adalah interface $name")
    }
}

//contoh class yg menerima turunan dari interface terhadap interface
//jadi kita tidak perlu menulis inheritanceInterface ulang
//cukup menuliskan SecondaryInterface,karena interface SecondaryInterface termasuk dari turunan InheritaceInterface
class Human(override val nama: String, override val name: String): SecondInheritance{
    override fun example(name: String){
        println("ini adalah interface to interface 1")
    }
    override fun go(){
        println("ini adalah interface to interface 2")
    }
}