package data
//properties dan function abstract
//jadi kita mengisi/menginisilisasikan properties pada class turunan dari class abstract

abstract class abstractpropertis {
    abstract val name : String
    abstract fun ujang()
}

class first: abstractpropertis(){
    override val name: String = "Pandu"
    override fun ujang(){
        println("ini adalah fungsi");
    }
}

class Second: abstractpropertis(){
    override val name: String = "Bobby"

    override fun ujang() {
        println("he is ${this.name}")
    }

}