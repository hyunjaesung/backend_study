data class PersonDto (private val name: String, private val age: Int)

enum class Country(val code: String){
    KOREA("KO"),
    AMERICA("US")
}

fun handleCountry(country:Country){
//    when{
//        Country.KOREA == country -> println("Super Korea!")
//        Country.AMERICA == country -> println("Super US!")
//    }
    when(country){
        Country.KOREA -> println("Super Korea!")
        Country.AMERICA -> println("Super US!")
    }
}

fun main(){
//    val stevy = PersonDto(age = 10, name = "stevy");
//    val stevy2 = PersonDto(age = 10, name = "stevy");
//
//    println(stevy == stevy2);
//    println(stevy.hashCode());
//    println(stevy.toString());
    handleCountry(Country.KOREA);
}
