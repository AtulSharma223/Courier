import java.util.*

open class Customer {
    var sc = Scanner(System.`in`)
    var choice = 0
    var id = 0
    var password = 0
    var `val` = 0
    fun checkUser(map: HashMap<Int, Int>) {
        println("Press \n1 for login \n2 for sign up ")
        choice = sc.nextInt()
        val ck = check()
        if (choice == 1) {
            `val` = ck.login(map)
            if (`val` == 1) {
                println("Succesfully login")
            } else {
                println("Wrong id or Password")
            }
        }
        if (choice == 2) {
            `val` = ck.signup(map)
            if (`val` == 0) {
                println("ID exist.Use Different ID")
            } else {
                println("User Created Successfully")
            }
        }
    }

    var arr = arrayOfNulls<Product>(10)
    var totalAmount = 0
    fun addProduct() {
        var ct = 0
        var choice: Int
        while (true) {
            println("Press \n1 to add product \n2 for billing")
            choice = sc.nextInt()
            if (choice == 2) {
                val bill = generateBill()
                bill.getBill(arr, ct)
                break
            }
            val p1 = Product()
            arr[ct++] = p1
        }
    }
}
