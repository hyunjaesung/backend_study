fun main() {

    val numbers = listOf(100, 200);

    println(numbers[0]);

    for (number in numbers) {
        println(number);
    }

    for ((value, index) in numbers.withIndex()) {
        println("$value $index")
    }

    val map1 = mutableMapOf<Int, String>()

    map1[1] = "MONDAY"
    map1[2] = "TUESDAY"

    val map2 = mapOf<Int, String>(1 to "MONDAY", 2 to "TUESDAY");

    for(key in map2.keys){
        println(key);
        println(map2[key])
    }

    for((key, value) in map2.entries){
        println("$key $value");
    }
}
