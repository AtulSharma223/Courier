import java.util.*

object UserKart {
    @JvmStatic
    fun main(args: Array<String>) {
        // TODO Auto-generated method stub
        val map = HashMap<Int, Int>()
        val sc = Scanner(System.`in`)
        while (true) {
            val c1 = Customer()
            c1.checkUser(map)
            if (c1.`val` == 0) {
                continue
            }
            c1.addProduct()
            println("\n Press \n1 for next user \n2 for exit")
            var choice: Int
            choice = sc.nextInt()
            if (choice == 2) {
                break
            }
        }
    }
}
