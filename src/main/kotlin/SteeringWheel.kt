class SteeringWheel {
    private var position = SteeringWheelPositions.Straight

    fun turnLeft(){
        position = SteeringWheelPositions.Left
    }

    fun turnRight(){
        position = SteeringWheelPositions.Right
    }
}