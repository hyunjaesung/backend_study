interface Movable{
    fun move();
    fun fly();
}

fun main(){
    moveSomething(object : Movable {
        override fun move() {
            println("움직여어어어ㅓ")
        }
        override fun fly() {
            println("날아라아아아아")
        }
    })
}

private fun moveSomething(movable: Movable){
    movable.move();
    movable.fly();
}
