package data2

//kata kunci super tidak hanya bisa digunakan untuk mengakses function/properties pada class parent
//keyword "super" juga bisa digunakan untuk mengakses constructor class parent
//mengakses class parent hanya bisa dilakukan di dalam construcotr class child

open class Custommer(val name:String,val type:String,val balance: String) {
    constructor(name:String,type:String): this(name,type, "")//pada setiap constructor paling ujung wajb di inisilisasikan
    constructor(name: String): this(name,"")
}

//ketika menggunakan super constructor, kita disarankan untuk tidak membuat primary constructor class
//sebab dengan membuat primary constructor maka wajib diakses oleh secondary constructor dari class
//dengan adanya primary constructor,maka kita tidak dapat membuat super constructor

class PremiumCustomer: Custommer {
    constructor(name: String): super(name,"")
    constructor(name: String,type:String): super(name,type,"")
}

//jika memaksakan menggunakan primary constructor maka yg terjadi malah seperti inheritance

class ExcecutiveCustommer(name: String, balance: String): Custommer (name,"",balance){
    constructor(name: String): this(name,"")
}