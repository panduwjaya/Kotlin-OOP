package `14_to_50`

//salah satu design pattern lain yang populer adalah design pattern
//delegation adalah meneruskan properties/function ke object yg lain
//delegation terdapat 2 jenis manual dan otomatis
//pada kotlin mendukung delegation tanpa harus secara manual

/**FUNGSI DARI DELGATION ADALAH:
 * Delegation adalah meneruskan properties/function ke object yg lain
 */

import data.*

fun main() {
    //INI HASIL OVERRIDE PROPERTIES PADA INTERFACE
    val myDelegation = MyDelegation()
    myDelegation.hallo("muhkito")

    //INI MENGGUNAKAN DELEGATION MANUAL
    //kelemahan menggunakan delegation manual adalah kita lebih rumit dalam menuliskan kodenya
    val myDelegation2 = DelegationManual(myDelegation)//jadi Mydelegation2 memanggil ulang object dari madelegation diatas
    myDelegation2.hallo("ganang")

    //INI MENGGUNAKAN DELEGATION MANUAL
    val myDelegation3 = DelegationManual(myDelegation)
    myDelegation3.goodBay("ini uppercase")

//===========================INI MENGGUNAKAN DELEGATION OTOMATIS==============================

    //INI HASIL OVERRIDE PROPERTIES PADA INTERFACE
    val delegationAuto = DelegationAuto2()
    delegationAuto.halloo("andre")

    //INI HASIL DELEGASI OBJECT
    val delegationAuto2 = DelegationAuto3(delegationAuto)
    delegationAuto2.halloo("iqbal")

    //INI HASIL DELEGASI OBJECT
    val delegationAuto3 = DelegationAuto3(delegationAuto)
    delegationAuto3.goodBayy("bintang")

    //INI CONTOH DELEGATION SEBAGIAN
    val delegationPart = DelegationPart(delegationAuto)
    delegationPart.halloo("Adib")
}