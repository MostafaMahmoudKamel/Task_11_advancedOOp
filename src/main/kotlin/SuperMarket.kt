class SuperMarket {

    //fun take product(Grocery or Electronic) and print information
    fun displayProduct(product: Product) {

        when (product) {
            is GroceryProduct -> println("GroceryProduct")
            is ElectronicProduct -> println("ElectronicProduct")
        }

        //print data about object [Grocery or Electronic]
        println(product.getDiscountedPrice())
        println(product.getProductInfo())
        println()
    }
}