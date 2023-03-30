abstract class Automobile /*<T: Transmission> */{
    protected val steeringWheel = SteeringWheel()
    protected var pedalGas = Pedal()
    protected var pedalBrake = Pedal()
    protected val ignition = Ignition()

    abstract fun moveStraight()


    abstract fun moveBackward()

    fun turnLeft(){
        steeringWheel.turnLeft()
    }


    fun turnRight(){
        steeringWheel.turnRight()
    }

    abstract fun stop()



}