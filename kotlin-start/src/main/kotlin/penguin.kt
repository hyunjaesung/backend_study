abstract class Animal(protected val species: String, protected open val legCount: Int){
    abstract fun move()
}

interface Flyable {
    fun act() {
        println("파닥 파닥")
    }
}

interface Swimable {
    fun act() {
        println("어푸 어푸")
    }
}

class Penguin(species: String) : Animal(species, 2), Flyable, Swimable{
    val wingCount: Int = 2
    override val legCount
        get() = super.legCount + wingCount


    override fun move() {
        println("펭귄 무브 무브")
    }

    override fun act() {
        super<Flyable>.act();
        super<Swimable>.act();
    }
}

fun main() {
    val penguin = Penguin("황제")

    penguin.act();
    penguin.move();
}
