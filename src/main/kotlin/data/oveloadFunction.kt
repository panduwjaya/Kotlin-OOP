package data

//overload function adalah kemampuan membuat function dengan nama yg sama di dalam class yg sama
//yang membedakan adalah parameter baik jumlah paramter,bisa jugaa tipe data parameter
//untuk jenis nya harus sama jika unit maka unit semua jika return,maka return semua

class oveloadFunction (val para1: String = "",val para2: String = ""){

    //berbeda jumlah parameternya
    fun happy(paramName: String){
        println("happy birthday $paramName")
    }

    //berbeda parameternya
    fun happy(paraFirstName: String, paramLastName: String){
        println("happy graduation $paraFirstName $paramLastName")
    }

    //berbeda tipe datanya
    fun happy(paraFirstName: Int, paramLastName: Int){
        println("Iam born in $paraFirstName $paramLastName")
    }
}