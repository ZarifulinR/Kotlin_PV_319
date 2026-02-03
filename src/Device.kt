open class Device(
    val brand: String,
    var powerOn: Boolean = false
) {
    open fun turnOn() {
        powerOn = true
        println("$brand device is ON")
    }

    fun turnOff() {
        powerOn = false
        println("$brand device is OFF")
    }
}
