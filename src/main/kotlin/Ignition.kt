class Ignition {
    private var enabled = false

    fun disable(){
        enabled = false
    }

    fun enable() {
        enabled = true
    }

    fun isEnabled(): Boolean {
        return enabled
    }
}