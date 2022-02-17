package `14_to_50`

//type alias
//type alias adalah membuat inisilisasi atau panggilan/nama baru pada class,fungsi atau variabel yang telah ada
//biasanya digunakan ketika ada tipe data dengan nama yg sama,atau untuk mempersingkat penyebutan
//cukup dengan menambahkan kata "typealias"

import data2.Alias01
import data2.Alias02
import data2.Alias03

typealias Class01 = Alias02
//penggunaan typealias saat import langsung dapat bisa dilakukan
typealias Class02 = data.Alias01

//kita dapat menggunakan typealias dalam susunan rekursif
typealias ClassFirst = Alias03
typealias ClassSecond = ClassFirst


fun main() {
    val object1 = Alias01()
    object1.functionFirst()
    val object2 = Class01()
    object2.functionFirst()
    val object3 = Class02()
    object3.functionFirst()
}