package `14_to_50`

//Di java kita sering mengenal eror "NullPointerException" eror itu terjadi ketika kita mengakses properties atau function di null object
//Null object adalah,kita lupa mendeklarasikan inisilisasi data si variabelnya,lalu variabel nya diakses oleh properties atau object sehingga terjadi NullPointerException
//Namun di kotlin sendiri jarang terjadi NullPointerException dikarenakan sejak awal tidak direkomendasikan untuk menggunakan nullable type.
//Walaupun akan menggunakan nullable type di kotlin kita memberitahu secara eksplisit menggunakan tanda tanya (?)
//kali ini kita akan bahas cara agar terhindar dari error NullPointerException

//1.CHECKING FOR NULL
//Pada bagian ini kotlin secara otomatis akan melakukan pengecekan tanpa memerlukan else
data class Friend(val name: String)

fun sayHallo(friend: Friend?){
    if (friend != null){
        println("hello friend,i am ${friend.name} this is not nullable")
    }
}

//2.SAFECALL MENGGUNAKAN TANDA TANYA (?) -> (INI DIREKOMNEDASIKAN)
fun usingTanya(tanya: Friend?){
    println("Hallo I am ${tanya?.name}")
}

//3.ELVIS OPERATOR
//elvis operator berfungsi untuk mengubah standar library null pada "SAFECALL MENGGUNAKAN TANDA TANYA(?)",menjadi sesuai keinginan kita
fun elvisOperator(elvis: Friend?){
    val variabel = elvis?.name ?: "empty"
    println("Hello $variabel")
}

//4.MENGGUNAKAN OPERATOR (!!)
//jika kita sangat menyukai NullPointerException,kita bisa menggunakan operator (!!)
//dengan syarat kita yakin bahwa variabel tersebut tidak null
//maka kita bisa menggunakan keyword (!!) untuk menkonversi dari data yang nullable menjadi data tidak nullable
//tapi jika sampai datanya null maka akan terjadi error
fun notNull(notNull: Friend?){
    val variabel = notNull!!.name//terdapat penggunaan (!!),yang berarti memaksa bahwa "name" tidak akan bernilai null
    println("Hallo $variabel")
}

fun main() {
    sayHallo(Friend("Eko"))
    sayHallo(null)//dalam kondisi nullsafety
    usingTanya(Friend("Khanedy"))
    usingTanya(null)//hasil,"Hallo I am null"
    notNull(Friend("Alvin"))
    //notNull(null) ini akan berdampak eror berupa "NullPointerException",jika sampai terjadi null pada fun notNull
}