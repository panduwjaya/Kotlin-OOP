package data

//constructor merupakan parameter pada class
//constructor merupakan suatu hal yang pertama kali dieksekusi ketika object dibuat
//"null" adalah default value

class constractor (ParafirstName: String = "null", ParamiddleName: String = "null", ParalastName: String = "null"){

    //ini disebut sebagai properties
    //constractor dapat mengakses/mengubah data pada properties didalam initializer block pada class

    var firstName: String = ParafirstName //kita dapat mengubah isi dari properties variabel firtsname dengan constractor parafirstname
    var middleName: String = ParamiddleName
    var lastName: String = ParalastName
}