abstract class Animal(protected val species: String, protected open val legCount: Int){
    abstract fun move()
}

class Cat(species: String) : Animal(species, 4) {
    override fun move() {
        println("사뿐 사뿐 걸어가는 고양이의 종은 $species")
    }
}

class Penguin(species: String) : Animal(species, 2){
    private val wingCount: Int = 2

    override fun move() {
        println("뒤뚱 뒤뚱 펭귄의 다리는 ${legCount}개")
    }

    override val legCount
        get() = wingCount + super.legCount
}

fun main(){
    val cat = Cat("고등어")
    cat.move()
    val penguin = Penguin("황제")
    penguin.move()
}
