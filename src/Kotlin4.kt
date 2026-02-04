fun main(){
    println(getLenth("Hello")) // 6
    println(getLenth(null))
    println(funAny("Hello")) // 6
    println(funAny(5))        // 25
    println(funAny(null))     // -1
    println(funAny(3.14))
}
fun getLenth(text: String?): Int{
    return text?.length ?:0
}
fun funAny(value: Any?): Int {
    val str = value as? String

    return when {
        value == null -> -1
        str != null -> str.length
        value is Int -> value * value
        else -> 0
    }
}