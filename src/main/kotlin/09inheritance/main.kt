package `09inheritance`

import data.Person1
import data.Person2

fun main() {
    val human = Person1("Bintang")
    human.helloGoodBye("rafi")//kita dapat mengakses fungsi didalam class inheritance

    val human2 = Person2("Hamdan")
    human2.helloGoodBye("Sudrajat")//kita dapat mengakses segala behave yang terdapat pada primary class
}