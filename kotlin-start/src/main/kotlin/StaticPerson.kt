
class StaticPerson private constructor (val name: String, val age: Int){
    companion object {
        private const val MIN_AGE = 1;
        fun newBaby(name: String): StaticPerson{
           return StaticPerson(name, MIN_AGE)
        }
    }
}

fun main() {
    val newMan = StaticPerson.newBaby("stevy")
    println(newMan.age) // 1
    println(newMan.name) // stevy
}
