package companionObject

class CompanionObjectClass {

    var myName="Mostafa"

    companion object{   //like Static in c++

        fun printCompanionObjectName(){
            println("companion details")

        }
    }

    init {
        println("object of class is Created")
    }
}

fun main() {
    CompanionObjectClass.printCompanionObjectName()     //access function without creating object of class
}