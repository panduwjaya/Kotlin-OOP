package `08thisKeyword`

import data.thisKeyword

fun main(){
    //kelebihan menggunakan class adalah kita dapat mengakses segala hal pada class tsb melalui object yg kita buat
    //termasuk fungsi,properties,initliezer block dll

    val person1 = thisKeyword("Bintang")//mengisi dari primary constructor pada class
    person1.helloEveryone("Pandu")
}