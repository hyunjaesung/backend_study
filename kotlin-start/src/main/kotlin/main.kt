import java.util.IllegalFormatException

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        else -> "D"
    }
}

fun validate(score: Int) {
    if (score in 0..100) {
        println("")
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return if (obj is String) {
        obj.startsWith("A")
    } else {
        return false
    }
}

fun numIter(){
    val numbers = listOf<Long>(1L, 2L, 3L)
    for(number in numbers){
        println(number)
    }
}

fun manyForLoop(){
    for(i in 1..3){
        println(i)
    }

    for(i in 1..5 step 2){
        println(i)
    }

    for(i in 3 downTo 1){
        println(i)
    }

    for(i in 3 downTo 1 step 2){
        println(i)
    }
}

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true){
    for(i in 1..num){
        if(useNewLine)
            println(str)
        else
            print(str)
    }
}

fun printAll(vararg strings: String){
    for(string in strings){
        println(string)
    }

}

class KotlinPerson(val name: String = "stevy", var age: Int = 100){
    init {
        if(age <= 0){
            throw IllegalArgumentException("나이가 $age 로 너무 낮습니다")
        }
    }

    val upperName
        get() = this.name.uppercase();

    val upperName2 = name
        get() = field.uppercase()
}


fun main() {
    val person = KotlinPerson("stevy");
    println("${person.upperName},${person.upperName2}, ${person.age}");
}
