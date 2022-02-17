package `14_to_50`

import data.ScopeFunction

fun main() {
    val person1 = ScopeFunction("Pandu",11)
    println(person1.name)
    println(person1.age)

    //penggunaan let
    person1.let { //ini disebut sebagai block
        println(it.name)
        println(it.age)
    }

    //penggunaan run
    val person2 = person1.run {
        "Name ${this.name} and age is ${this.age}" //ini termasuk kedalam jenis kategori lambda
    }
    println(person2)

    //penggunaan apply
    //hasil yg ditampilkan adalah memory addres karena return value nya berupa object bukan string,Int atau yg lain

    val person3 = person1.apply {
        "Name ${this.name} and age is ${this.age}" //bersifat ignore karena tidak ditampilkan
    }
    println(person3)

    val person4 = person1.also {
        "Name ${it.name} and age is ${it.age}" //bersifat ignore karena tidak ditampilkan
    }
    println(person4)

    val person5 = with(person1){
        "Name ${this.name} and age is ${this.age}"
    }
    println(person5)
}