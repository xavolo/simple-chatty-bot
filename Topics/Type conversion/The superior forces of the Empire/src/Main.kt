fun main() {
    //println("Enter the number of Galactic Empire Ships")
    val numGalacticEmpireShips = readln().toInt()
    //println("Enter the number of Rebel Ships")
    val numRebelsShips = readln().toInt()
    val timesLarger: Int = (numGalacticEmpireShips/numRebelsShips)
    println("$timesLarger")
}