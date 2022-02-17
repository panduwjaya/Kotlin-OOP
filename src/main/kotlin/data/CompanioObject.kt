package data

//companion object adalah kemampuan membuat object di dalam class atau inner object tanpa harus menggunakan nama "object" seperti pada singleton object
//companion object secara otomatis akan menggunakan nama companion atau bisa langsung diakses lewat nama classnya

class CompanioObject (val param1: String){
    //tidak perlu menyebutkan nama dari objectnya lagi
    //contoh menyebutkan nama: (companion object objek1)
    //namun jika kita ingin menambahkan nama pada companion object juga tidak apa apa
    companion object{
        fun objek(paramA: String): String{
            return paramA
        }
    }
}