package data
//penggunaan initilizer block adalah untuk dapat menuliskan kalimat pada constructor


class Initializer (ParameterName: String = "kosong", ParameterTransmision: String = "kosong",
                   ParameterYear: Int = 0){

    //fungsi dari init
    init {
        println("kendaraan $ParameterName menggunakan transmisi $ParameterTransmision keluaran tahun $ParameterYear ")
    }

    var name: String = ParameterName
    var transmision: String = ParameterTransmision
    var year: Int = ParameterYear
}