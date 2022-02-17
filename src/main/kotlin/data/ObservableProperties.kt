package data

import kotlin.properties.Delegates

//observable properties merupakan sebuah library disediakan untuk properties di kotlin
//dengan observable properties kita dapat mengetahui value sebelum dan sesudah diubah
//delegationnya harus menggunakan var sebab akan mengalami perubahan

//class ObservableProperties {
//    var paramA: String by Delegates.observable(paramA){
//
//    }
//}