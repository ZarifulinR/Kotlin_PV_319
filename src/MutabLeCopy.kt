fun main(){

    val numbers = listOf(1, 2, 3, 2, 4, 3)
    val result = processNumbers(numbers)
    println(result)

    val words = listOf(
        "apple", "banana", "apple",
        "orange", "banana", "apple"
    )
    val (wordCounts, duplicates) = analyzeWords(words)

    println("Подсчёт слов: $wordCounts")
    println("Слова, встречающиеся более одного раза: $duplicates")
}
fun processNumbers(numbers: List<Int>): List<Int> {
    val mutableList = numbers.toMutableList()
    val uniqueList = mutableList.toSet().toMutableList()
    uniqueList.add(10)
    return uniqueList.toList()
}
fun analyzeWords(words: List<String>): Pair<Map<String, Int>, Set<String>> {
    val countMap = mutableMapOf<String, Int>()
    for (word in words) {
        countMap[word] = countMap.getOrDefault(word, 0) + 1
    }
    val readOnlyMap: Map<String, Int> = countMap.toMap()
    val duplicates: Set<String> = countMap.filter { it.value > 1 }.keys

    return readOnlyMap to duplicates
}
