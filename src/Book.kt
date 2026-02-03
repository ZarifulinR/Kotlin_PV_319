class Book(val title: String, pages: Int) {
    var pages: Int = pages
        set(value) {
            field = if (value < 0) 0 else value
        }
    fun print() {
        println("title:$title - pages:$pages");
    }
}