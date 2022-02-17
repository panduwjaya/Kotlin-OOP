package `14_to_50`

import data.late

fun main(){
    val handphone1 = late()
    handphone1.initlate("samsung","apple")
    println(handphone1.handphone)
    println(handphone1.ipad)

    val device = late()
    device.device()

    //kita juga dapat tidak memasukan value pada variabel di fun main
    println(device.deviceTools)

}