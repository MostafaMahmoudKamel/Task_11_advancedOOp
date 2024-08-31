package singleton

//create a Global object for all app
object Singleton {                          //object can't have (companion-object,open,extended or implemented)

    private var name = "myName"

    fun getName() = name

}



fun main() {
    var singleton1 = Singleton.getName()
    var singleton2 = Singleton.getName()
    println(singleton1 === singleton2)    //output:ture because two object share same reference on memory
}