class Pedal {
    private var pushed = false

    fun push(){
        pushed = true
    }

    fun release(){
        pushed = false
    }
}