package data
//Inner Object Pada Singleton object
/**
 * pada kotlin singleton object bisa dibuat didalam sebuah class
 * namun berbeda dengan inner class,singleton object tidak bisa mengakses properties dan function pada outer class nya
 */

class InnerObject(){

    object ObjectInner {
        fun functionObject(paramA: String): String {
            return paramA.toLowerCase()
        }
    }
}