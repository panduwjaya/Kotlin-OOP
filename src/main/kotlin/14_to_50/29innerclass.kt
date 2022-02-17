package `14_to_50`

//inner class berarti class di dalam class
//class terluar disebut sebagi "outer" class sedangkan class terdalam adalah "inner" class
//walaupun begitu inner class tidak dapat mengakses data dari outer class
//jadi tidak hubungan sama sekali antara class terluar dengan class terdalam
//untuk dapat mengakses data dari outer class,inner class membutuhkan keyword "inner"
//untuk penulisan nya kita dapat dengan ${this.@object.paramA}

class Province(val paramA: String){

    inner class City(val paramA2: String) {
        fun function1() {
            println("hallo ini merupakan kota $paramA2 yang berada di provinsi ${this@Province.paramA}")
        }
    }
}

fun main() {
    //cara menampilkan pada output
    val Province = Province("lampung")//kita wajib mendeklarasikan outer class terlebih dahulu,berperan seperti parent class
    val City = Province.City("Metro")
    val City2 = Province.City("sukadana")

    //hasil deklarasi 1
    City.function1()
    City2.function1()

    //antar deklarasi 1 dan 2 sudah berbeda,tidak terdapat kesamaan dikarenakan adanya perbedaan parent class nya
    val Province2 = Province("Medan")
    val City3 = Province2.City("PalangKaraya")
    val City4 = Province2.City("Pangkal Pinang")

    //hasil deklarasi 2
    City3.function1()
    City4.function1()
    
}