package `12superKeyword`

import data.shape1
import data.superKeyword

fun main() {
    val superPropertiess = shape1()
    println("hasil dari class corner overide ${superPropertiess.corner}")
    println("hasil dari super corner atau superclass/parent class ${superPropertiess.parentCorner}") //super properties

    val superFunction = shape1()
    superFunction.printNama()//super function
}