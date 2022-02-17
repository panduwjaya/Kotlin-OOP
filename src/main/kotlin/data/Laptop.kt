package data

class Laptop(val name: String)

open class Handphone(val name: String)//open untuk inherintance ke class SmartPhone

class SmartPhone(name: String, val os:String): Handphone(name)