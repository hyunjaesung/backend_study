import java.util.StringJoiner

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

fun main() {
    println(getGradeWithSwitch(88))
//    println(startsWithA(12))
}
