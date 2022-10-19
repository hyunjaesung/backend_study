class Fruit(val name: String, val price: Int) {
    override fun toString(): String {
        return "$name : $price"
    }
}

fun filterFruits(
    filter: (Fruit) -> Boolean, fruits: List<Fruit>
): MutableList<Fruit> {
    val results = mutableListOf<Fruit>();
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results;
}

fun filterFruits2(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): MutableList<Fruit> {
    val results = mutableListOf<Fruit>();
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results;
}

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("바나나", 3_000),
        Fruit("포도", 9_000),
        Fruit("토마토", 2_000),
        Fruit("수박", 10_000),
        Fruit("망고", 13_000),
    )
    println(
        filterFruits({ fruit -> fruit.name == "사과" }, fruits)
    );
    println(filterFruits2(fruits) { fruit -> fruit.price >= 1000 });
    println(filterFruits2(fruits) { it.price >= 1000 });
}
