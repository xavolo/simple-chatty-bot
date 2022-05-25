fun main() {
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
    if (number3 > number2){
        println(number1 in number2..number3)
    }
}