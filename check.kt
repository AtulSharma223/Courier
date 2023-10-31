import java.util.*

class check {
    var map = HashMap<Int, Int>()
    var sc = Scanner(System.`in`)
    var id = 0
    var password = 0
    fun login(map: HashMap<Int, Int>): Int {
        println("Enter id and Password")
        id = sc.nextInt()
        password = sc.nextInt()
        return if (map.containsKey(id)) {
            if (password == map[id]) {
                1
            } else {
                0
            }
        } else {
            0
        }
    }

    fun signup(map: HashMap<Int, Int>): Int {
        println("Create ID and Password")
        val id = sc.nextInt()
        return if (map.containsKey(id)) {
            0
        } else {
            val password = sc.nextInt()
            map[id] = password
            1
        }
    }
}
