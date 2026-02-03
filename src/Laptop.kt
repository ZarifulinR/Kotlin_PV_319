class Laptop(
    brand: String,
    var batteryLevel: Int
) : Device(brand) {

    override fun turnOn() {
        if (batteryLevel == 0) {
            println("Laptop $brand cannot turn on: battery is empty")
        } else {
            super.turnOn()
        }
    }
}
