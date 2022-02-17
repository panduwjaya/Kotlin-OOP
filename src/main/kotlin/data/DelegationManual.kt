package data

//tahap 1
interface DelegationPattern {
    fun hallo(name: String)
    fun goodBay(name2: String)
}

//tahap 2
class MyDelegation: DelegationPattern{
    override fun hallo(name: String) {
        println("hallo everybody,my name is $name")
    }

    override fun goodBay(name2: String) {
        println(name2.toUpperCase())
    }
}

//tahap 3

//delegation manual
//menjadikan class sebagai object
//serta wajib memiliki constractor
//jadi base berlaku sebagai properties dan object pada class atau dapat disebut delegation nya
class DelegationManual(val base: DelegationPattern): DelegationPattern{
    override fun hallo(name: String) {
        base.hallo(name)//fun hallo dari class MyDelegation dideklarasikan kedalam object atau constructor base
    }

    override fun goodBay(name2: String) {
        base.goodBay(name2)//function goodBay,dideklarasikan kedalam constructor base atau object base
    }
}