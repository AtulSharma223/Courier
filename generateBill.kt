import java.util.*

class generateBill {
    var sc = Scanner(System.`in`)
    fun getBill(arr: Array<Product?>, n: Int) {
        var total = 0
        for (i in 0 until n) {
            total = total + arr[i]?.price!!
        }
        val choice: Int
        println("User type , Press\n1 for Guest\n2 for Club")
        choice = sc.nextInt()
        println("Your all kart items are as : ")
        println("Product Name     Price       Type")
        for (i in 0 until n) {
            println(arr[i]?.productName + "       " + arr[i]?.price + "        " + arr[i]?.type)
        }
        println("Your total amount is : $total")
        var amount = 0.0
        if (choice == 1) {
            amount = guest().bill(total.toDouble())
            print("Your payble amount is   $amount")
        } else if (choice == 2) {
            amount = club().bill(total.toDouble())
            print("Your payble amount is     $amount")
        }
    }
}
