package data2

//secondary constructor tanpa primary
//kelebihannya adalah kita bebas untuk melakukan pemanggilan terhadap constractor manapun
//kekurangan dari NoPrimary constructor adalah tidak bisa langsung dengan var street: String = paramA
//yang dapat melakukan var street: String = paramA adalah dengan primary constructor
class NoPrimary {

    var street: String = "" //kekurangan dari NoPrimary adalah tidak bisa langsung dengan var street: String = paramA
    var city: String = ""
    var country: String = ""

    constructor(paramA: String,paramB: String){
        street = paramA
        city = paramB
        println("kedua")
    }

    constructor(paramA: String){
        street = paramA
        println("pertama")
    }

    //penggunaan this pada secondary constructur yg tidak memiliki constructor adalah tidak wajib
    constructor(paramA: String,paramB: String,paramC: String) : this(paramA, paramB){
        street = paramA
        city = paramB
        country = paramC
        println("ketiga")
    }

}