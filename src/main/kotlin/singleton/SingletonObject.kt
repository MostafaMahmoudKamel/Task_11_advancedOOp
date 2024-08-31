package singleton

//SingletonObject class is Object in kotlin
class SingletonObject private constructor() {

    companion object {
        private var instance: SingletonObject? = null

        fun getInstance(): SingletonObject {
            if (instance == null) {
                instance = SingletonObject()
            }
            return instance!!
        }

    }
}

fun main() {

    var singletonObject = SingletonObject.getInstance()

}