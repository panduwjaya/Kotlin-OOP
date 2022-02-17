package `14_to_50`

import data.Accounts
//TUJUAN DARI OBSERVABLE PROPERTIES:
//KITA DAPAT MENDETEKSI PERUBAHAN VALUE PADA PROPERTIES DARI WAKTU KE WAKTU MENGGUNAKAN DELEGATION

fun main() {
    val example = Accounts()

    example.description = "Alvin"
    example.description = "Muhkito"
    example.description = "Nyoman"
    //tujuan dari print 3 jenis dengan value berbeda adalah agar kita dapat melihat perubahan value yang ada dari waktu ke waktu

}