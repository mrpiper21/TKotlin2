class fruit {
    var color = ""
    var name = ""
}

fun main() {
    val MyFruit = fruit()
    MyFruit.color = "green"
    MyFruit.name = "Watermelon"
    println(MyFruit.name)
    println(MyFruit.color)


    val h = 2
    when (h){
        in 1..3 -> println("found")
        else -> println("Does not exist")
    }

    val x = 20
    val y = 10
    val z = 10
    when(x){
        (y+z) -> println("fufilled")
        else -> println("invalidated")
    }
    // collection
    // Array of numbers
    // immutable
    val numbs = listOf(4, 5, 6)
    println(numbs)
    for(i in 1..4){
        when(numbs[1]){
            1 -> {
                println("found")
                break
            }
            else -> {
                println("not found")
                break
            }
        }
    }

    val num2 = mutableListOf("set", "map", "toe", "shoe", "seed")
    num2.add("Beans")

    val nimble = num2.iterator()

    while(nimble.hasNext()){
        println(nimble.next())
    }

    val r = num2.filter {it.startsWith("s")}
    println(r)


    // kotlin hashmap
    val theMap = HashMap<String, Int>()
    theMap["apple"] = 4
    theMap["pawpaw"] = 5
    theMap["grapes"] = 2
    println(theMap)

    // using pair
    val theMap2 = mapOf(Pair("one", 1), Pair("two", 2), Pair("ten", 10), Pair("five", 5))
    println(theMap2)

    // Kotlin map Properties
    println("Entries " + theMap.entries)
    println("Keys " + theMap.keys)
    println("Values " + theMap.values)

    // using iterator to map through the map
    val itr = theMap2.keys.iterator()
    while(itr.hasNext()){
        val key = itr.next()
        val value = theMap2[key]
        println("key = ${key} value = ${value}")
    }

    // using for loop
    for((k, v)  in theMap2){
        println("${k} = ${v}")
    }

    // using forEach

    theMap2.forEach {k , v -> println("k = ${k} V = ${v}")}

    // containsKey and value
    if(theMap2.containsKey("one") && theMap2.containsValue(2)) {
        println(true)
    }

    // removing elements from a mutable map
    theMap.remove("apple")
    println("result after romoving an element ${theMap}")

    // sorting map
    val RSortedMap = theMap2.toSortedMap()
    println("Sorted Map $RSortedMap")

    // filtering keys and values
    val resultMap1 = theMap2.filterKeys { it != "five" }
    println("filtered Keys ${resultMap1}")
    val resultMap2 = theMap2.filterValues { it > 1 }
    println("filtered values ${resultMap2}")

    val resultMap3 = theMap.map{(v, k)-> "key is $k value is $v"}
    println("Mapped object $resultMap3")

    // mutable map
    val theMap3 = mutableMapOf(Pair("Benz", 2), Pair("Chevez", 4), Pair("Ford", 4), Pair("Roseroyce", 3))
    theMap3.put("Lambourghini", 1)
    println(theMap3)
    theMap3.remove("Chevez")
    println("One Car is sold out from $theMap3")
}
