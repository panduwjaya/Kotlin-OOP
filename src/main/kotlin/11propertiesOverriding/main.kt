package `11propertiesOverriding`

import data.propertiesFirst
import data.propertiesOverriding
import data.propertiesSecond

fun main(){
    val part1 = propertiesFirst()
    println(part1.corner)

    val part2 = propertiesSecond()
    println(part2.corner)

    val part3 = propertiesOverriding()
    println(part3.corner)

}