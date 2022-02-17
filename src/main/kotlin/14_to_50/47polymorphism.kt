package `14_to_50`

//polymorphism
//polymorphism berasal dari bahasa yunani berarti banyak bentuk
//dalam OOP polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
//polymorphism berarti kita dapat melakukan integral atau anti turunan
//polymorphism erat hubungan dengan inheritance

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee: Employee = Employee("Eko")//alasan penggunaan var pada object polymorphism adalah agar variabel yang terkandung di dalamnya dapat berubah
    employee.sayHello("Budi")

    employee = Manager("Eko")
    employee.sayHello("Budi")

    employee = VicePresident("Eko")
    employee.sayHello("Budi")
}