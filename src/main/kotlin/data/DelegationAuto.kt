package data

//MEMBUAT DELEGASI OTOMATIS

//tahap 1
interface DelegationAuto1{
    fun halloo(name: String)
    fun goodBayy(name2: String)
}

//tahap 2
class DelegationAuto2: DelegationAuto1{
    override fun halloo(name: String) {
        println("hallo everybody,my name is $name")
    }

    override fun goodBayy(name2: String) {
        println(name2.toUpperCase())
    }
}

//tahap 3
//menggunakan delegation otomatis
//kelebihan menggunakan delegation otomatis adalah tidak perlu menulis cukup panjang pada delegasi class nya
//DelegationAuto1 mendelegasikan langsung kepada base1
//jadi kita tidak perlu mengoveride lalu medelegasikan object seperti delegasi manual
class DelegationAuto3(val base1: DelegationAuto1) : DelegationAuto1 by base1//DelegationAuto1 by base1,artinya mendelegasikan seluruh overide properties/funtion DelegationAuto2 ke base1

/**CARA MELAKUKAN DELEGASI SEBAGIAN:
 * jika tidak ingin mendelegasikan keseluruhan properties,cukup menggunakan kurung kurawal dan mengoveride yg dibutuhkan
 * cara untuk tidak mendelegasikan keseluruhan properties terdapat di video delegation programer jaman now menit 8.53
 */

//CONTOH DELEGASI SEBAGIAN
class DelegationPart(val base2: DelegationAuto1) : DelegationAuto1 by base2{
    override fun halloo(name: String) {//YANG DI DELEGASIKAN HANYA fun halloo
        println("hallo my name is $name and this is delgation partly")
    }
}
