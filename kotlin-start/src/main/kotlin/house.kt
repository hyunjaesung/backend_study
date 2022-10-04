class BetterHouse(private val address: String, private val livingRoom: LivingRoom) {
    class LivingRoom(private val area: Double)
}

class WorseHouse(private val address: String) {
    private val livingRoom: LivingRoom = LivingRoom(10.0)
    inner class LivingRoom(private val area: Double){
       val address
        get() = this@WorseHouse.address
    }
}
