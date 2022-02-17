package data

//abstract class artinya class tersebut tidak dapat dijadikan sebagai objek
//namun kelas tersebut akan dijadikan turunan oleh class lain atau sebagai parent class
//kelebihan dari abstract class adalah ketika kita menurunkan class tsb ke class lain tidak memerlukan keyword "open"

abstract class abstractClass (val nama: String = "Mbappe")

class nameOfstudent (nama: String): abstractClass(nama)
class nameOfteacher (nama: String): abstractClass(nama)