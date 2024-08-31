//base Class for products
abstract class Product : CalculateDiscount {

    private var name: String = "DefaultName"
    private var price: Double = 0.0
    private var quantity: Int = 0

    private fun getName() = this.name
    fun setName(name: String) { this.name = name }

    fun getPrice() = this.price               //encapsulate Price with private
    fun setPrice(price: Double) { this.price = price }

    fun getQuantity() = this.quantity
    fun setQuantity(quantity: Int) { this.quantity = quantity }


    open fun getProductInfo(): String {
        return "name :${this.getName()}\t price : ${this.getDiscountedPrice()} \t quantity : ${this.getQuantity()}"
    }

}


