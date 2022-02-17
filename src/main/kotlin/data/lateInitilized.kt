package data

//fungsi dari late initilized agar kita dapat menunda memasukan value pada variabel
//hanya bisa dilakukan pada var
//kita memasukan isi dari properties pada class pada fungsi dibawahnya

class late {
    lateinit var handphone: String
    lateinit var ipad: String
    lateinit var deviceTools: String

    fun initlate(handphone: String, ipad: String){
        this.ipad = "apple"
        this.handphone = handphone //kita baru mengisi value dari properties/variabel disini
    }

    fun device(){
        deviceTools = "router" //kita juga dapat memasukan lgsg isi dari value variabel yg ada
    }
}