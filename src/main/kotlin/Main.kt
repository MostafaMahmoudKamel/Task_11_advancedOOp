import sealedInterface.State
import sealedInterface.handleState

fun main() {

    //lazy must be immutable (val)
    val superMarket: SuperMarket by lazy { SuperMarket() }

    //groceryProduct
    var groceryProduct: Product = GroceryProduct().apply {
        setPrice(5000.0)
        setQuantity(50)
    }
    superMarket.displayProduct(groceryProduct)


    //electronic product object
    val electronicProduct: Product = ElectronicProduct().apply {
        setPrice(10000.0)
        setQuantity(2)
    }
    superMarket.displayProduct(electronicProduct)   //displayProduct on SuperMarket


    //sealedInterface.State
    var myState: State<String> = State.Success("Success : Ture ")
    handleState(myState)

}