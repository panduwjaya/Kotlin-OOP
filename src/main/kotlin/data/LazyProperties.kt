package data

//delegation dapat kita simpan didalam properties fungsi tersebut adalah lazy prpoerties
//lazy adalah standar library agar properties baru diinisilisasi ketik properties itu dipakai


class LazyProperties {
    val paramA: String = "ini adalah eigher properties"//artinya ketika
    val paramB: String by lazy {//di delegasikan menggunakan "by lazy"
        println("Name is called")//ini merupakan lazy properties
        "Pandu"//ini merupakan return value yg akan mengisi value pada properties paramB
    }
}