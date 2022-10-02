fun getPassOrFail(score:Int): String{
    return if(score >= 50){
        "P"
    }else{
        "F"
    }
}

fun getGrade(score: Int): String {
    return when{
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        else -> "D"
    }
}

fun validate(score: Int){
   if(score in 0..100){
       println("")
   }
}

fun main() {
    println(validate(80))
}
