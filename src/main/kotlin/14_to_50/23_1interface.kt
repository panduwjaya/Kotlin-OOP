package `14_to_50`

import data.SecondPerson
import data.firstPerson

fun main(){
    //interface biasa
    val subject1 = firstPerson("pak wahid")
    subject1.exampleSecond("Pandu")
    subject1.example("Pak somad")

    //multiple interface
    val subject2 = SecondPerson("Bintang", "doddy")
    subject2.goo("")
    subject2.go()

    //interface to interface
    val subject3 = Human("Adib","Cahyana")
    subject3.example("Adi")
    subject3.go()
}