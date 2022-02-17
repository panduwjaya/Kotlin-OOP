package data2

class Citizen(val name: String) {

    override fun hashCode(): Int{
        return name.hashCode()
    }
}