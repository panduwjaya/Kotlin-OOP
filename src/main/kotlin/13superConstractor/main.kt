package `13superConstractor`

import data2.Custommer
import data2.PremiumCustomer

fun main(){
    val customer = Custommer("Pandu", "170","64")
    println(customer.name)
    println(customer.type)
    val premiumCustomer = PremiumCustomer("Pandu")
    println(premiumCustomer.name)
}