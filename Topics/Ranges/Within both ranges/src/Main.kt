fun main() {
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
    val number4 = readln().toInt()
    val number5 = readln().toInt()
    println(number5 in number1..number2 && number5 in number3..number4)
}