package `05properties_di_constructor`

import data.propertiesConstractor

fun main(){
    val user1 = propertiesConstractor("Pandu","Wijaya")
    //contoh perubahan seteleh deklarasi di dalam primary constructor user1.paraName = "ujang"
    //yang dapat berdampak eror pada penggunaan val

    val user2 = propertiesConstractor("bintang","Raffi")
    
    println(user1.paraName)
    println(user1.paralastName)
    println(user2.paraName)
    println(user2.paralastName)
}