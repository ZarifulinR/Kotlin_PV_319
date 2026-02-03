data class Product(
    val name: String,
    private var _price: Double
) {
    var price: Double
        get() = _price
        set(value) {
            _price = if (value < 0) 0.0 else value
        }

    fun applyDiscount(percent: Int) {
        require(percent in 0..100) { "Скидка должна быть от 0 до 100%" }
        price -= price * percent / 100
    }
}
