import java.util.*

class Product internal constructor() {
    @JvmField
	var productName: String
    @JvmField
	var price: Int
    @JvmField
	var type: String
    var sc = Scanner(System.`in`)

    init {
        print("Enter product name : ")
        productName = sc.next()
        print("Enter Shipping Cost : ")
        price = sc.nextInt()
        print("Enter product type : ")
        type = sc.next()
    }
}
