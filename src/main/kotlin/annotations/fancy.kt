package annotations

import java.lang.RuntimeException

@Target(AnnotationTarget.CLASS)//jika target berupa class,annotationnya hanya bisa ditambahkan pada class
//pilihan pada retention
//source = artinya hanya berlaku pada source code,ketika di compile hilang
//binary = ketika di compile ada pada hasil compilasinya
//runtime = hasilnya masuk di compile dalam binarynya,tapi dapat dibaca reflection
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented //dapat di dokumentasikan atau tidak
annotation class fancy (val author: String){
}