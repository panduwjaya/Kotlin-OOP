package `14_to_50`

import data2.Citizen

//hashcode adalah function yg digunakan sebagai representasi dalam bentuk angka pada object yg kita buat
//artinya kita merubah object yg kita buat kedalam bentuk angka
//function Hashcode sangat berguna saat kita ingin menkonversi objek kita menjadi angka
/**salah satu penggunaan hashcode yg banyak dilakukan adalah di struktur data/kotlin collection
 * misal untuk memastikan tidak ada data duplicate,agar lebih mudah,dicek nilai hashCodenya
 * jika hashCode sama,maka dianggap objectnya sama
 * kelebihan dari pengecekan angka menggunakan int lebih rendah memory dibanding menggunakan string
 */

fun main() {
    val object1 = Citizen("Pandu")
    val object2 = Citizen("Pandu")

    println(object1.hashCode())//hasilnya berupa object dalam bentuk angka,mirip seperti alokasi memori namun sebenarnya bukan alokasi memori
    println(object2.hashCode())//hasilnya akan sama dengan seperti pada object 1
    println(object1.hashCode() == object2.hashCode())//hasilnya true,karena menggunakan function hascode,apabila menggunakan toString maka hasilnya false
}