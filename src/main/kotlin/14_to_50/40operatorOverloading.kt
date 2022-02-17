package `14_to_50`

//KOTLIN MENDUKUNG OPERATOR OVERLOADING,ARTINYA KITA BISA MEMBUAT FUNCTION DARI OPERATOR-OPERATOR SEPERTI MATEMATIKAN DAN LAIN-LAIN
//KEMAMPUAN INI MEMBUAT KITA BISA MELAKUKAN OPERASI APAPUN DI OBJECT,SEPERTI LAYAKNYA TIPE DATA INTEGER
//ADA BANYAK SEKALI OPERATOR YANG BISA DI OVERRIDE DI KOTLIN
//SEBENARNYA OPERATOR MERUPAKAN REPRESENTASI DARI SEBUAH FUNGSI,JADI KETIKA KITA MENGGUNAKAN OPERATOR SEBENARNYA KITA MEMANGGIL SEBUAH FUNGSI UNTUK DIJALANKAN

/**UNARY PREFIX OPERATOR
 * expresion = translated to function
 * +a = a.unaryPlus()
 * -a = a.unaryMinus()
 * !a = a.not()
 */

/**Increment & Decrement
 * expresion = translated to function
 * a++ = a.inc()+see below
 * a-- = a.dec()+see below
 */

/**aritmatik operator
 * expresion = translated to function
 * a+b = a.plus(b)
 * a-b = a.minus(b)
 * a*b = a.times(b)
 * a/b = a.div(b)
 * a%b = a.rem(b),a.mod(b)(deprecated)
 * a..b = a.rangeTo(b)
 *
 */

/**In Operator
 * expresion = translated to function
 * a in b = b.contains(a)
 * a !in b = !b.contains(a)
 */

/**Index Acces Operator
 * expresion = translated to function
 * a[i] = a.get(i)
 * a[i,j] = a.get(i, j)
 * a[i_1,...,i_n] = a.get(i_1, ...,i_n)
 * a[i] = b -> a.set(i, b)
 * a[i, j] = b -> a.set(i, j, b)
 * a[i_1,...,i_n] = b -> a.set(i_1, ...,i_n, b)
 */

/**Invoke Operator
 * expresion = translated to function
 * a() = a.invoke()
 * a(i) = a.invoke(i)
 * a(i, j) = a.invoke(i, j)
 * a(i_1,...,i_n) = a.invoke(i_1,...,i_n)
 */

/**assigment Operator
 * a+=b = a.plusAssign(b)
 * a-=b = a.minusAssign(b)
 * a*=b = a.timesAssign(b)
 * a/=b = a.divAssign(b)
 * a%=b = a.remAssign(b),a.modAssign(b)(deprecated)
 */

/**Equality dan inequality Operator
 * a == b = a?.equals(b) ?: (b === null)
 * a != b = !(a?.equals(b) ?: (b === null))
 */

/**Comparison Operator
 * a > b = a.compareTo(b) > 0
 * a < b = a.compareTo(b) < 0
 * a >= b = a.compareTo(b) >= 0
 * a <= b = a.compareTo(b) <= 0
 */

//MEMBUAT OPERATOR OVERLOADING
//UNTUK MEMBUAT OPERATOR OVERLOADING KITA BISA MENGGUNAKAN KATA KUNCI "operator" SEBELUM DEKLARASI FUNCTION NYA

data class Fruit(val quantity: Int){
    operator fun plus(fruit: Fruit): Fruit{//untuk melihat macam-macam operator dapat menggunakan pada bagian plus(ctrl+spasi)
        return Fruit(this.quantity + fruit.quantity)
    }
}

fun main() {
    val fruit1 = Fruit(100)
    val fruit2 = Fruit(100)
    val result = fruit1 + fruit2
    println(result)
}