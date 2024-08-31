class GroceryProduct : Product() {

    //implement fun interface CalculateDiscount
    override fun getDiscountedPrice(): Double {
        val price = getPrice()
        return price - (.05 * price)
    }

    //override open function of parentClass Product
    override fun getProductInfo(): String {
        return "${super.getProductInfo()} category: Grocery"
    }




}

