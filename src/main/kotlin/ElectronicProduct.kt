class ElectronicProduct : Product() {

    //implement fun interface CalculateDiscount
    override fun getDiscountedPrice(): Double {
        val price = getPrice()
        return price - (.1 * price) //discount 10%
    }

    //override open function of parentClass Product
    override fun getProductInfo(): String {
        return "${super.getProductInfo()} category: Electronic"
    }

}