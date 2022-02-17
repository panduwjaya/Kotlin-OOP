package data2

class Company(val name: String) {

    //dengan menggunakan modifikasi percabangan when,berfungsi agar kita dapat mensortir value apa saja pada object yg kita miliki
    //alasan menggunakan any? adalah object yg dibandingkan dapat berupa apapun baik null sekalipun
    //arti kata other berarti kita dapat memasukan perbandingan apapun termasuk class sekalipun
    //walaupun begitu kita dapat mengganti tulisan apapun,sebab kata other hanya menjadi informasi tambahan saja
    override fun equals(other: Any?): Boolean {
        return when(other){
            is Company -> name == other.name
            else -> false
        }
    }
}