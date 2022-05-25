fun main() {
    val x = readLine().toI // read other values in the same way
    val y = readLine().toBoolean()
    val z = readLine().toBoolean()
    val result: Boolean = !(x&&y)||z
    println("$result")
}