package data

//observable properties
//salah satu standar library yang disediakan oleh kotlin untuk delegationg di properties adalah observable properties
//dengan observable properties,kita bisa tahu value properties sebelum dan value setelah ketika diubah
//dengan mendelegasikan properties terhadap "Delegates.observable(nama properties)"

import kotlin.properties.Delegates

class Accounts(description: String = "Pandu") {//jadi kita mendeklarasikan constructor langsung pada properties jadi tidak membutuhkan tambahan val/var pada constructor
    var description: String by Delegates.observable(description){ property, oldValue, newValue ->
        println("${property.name} is changed from $oldValue to $newValue")
    }
    //untuk permasalahan "name" dapat dari mana,itu sudah masuk kedalam standar library di delegates observable
}