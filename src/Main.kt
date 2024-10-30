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


}
