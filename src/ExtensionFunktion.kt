
fun main() {
    val text: String? = null
    val text1: String? = "null"

    text?.let {
        it.printLength()
    } ?: println("No text found")
    text1?.let {
        it.printLength()
    } ?: println("No text found")
    val box = Box().apply {
        width = 5
        height = 4
    }.also {
        println("Объект создан")
    }
    println("Площадь: ${box.area()}")
}


fun String.printLength() {
    println("String lenth: ${this.length}")
}