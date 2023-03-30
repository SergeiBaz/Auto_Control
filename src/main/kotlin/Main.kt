fun main() {
    val ladaVestaFLSportEdition = AutomobileWithManualTransmission()
    ladaVestaFLSportEdition.turnRight()
    ladaVestaFLSportEdition.moveStraight()
    ladaVestaFLSportEdition.stop()
    ladaVestaFLSportEdition.moveBackward()

    val audiA6 = AutomobileWithAutomaticTransmission()
    audiA6.turnRight()
    audiA6.moveStraight()
    audiA6.turnLeft()
    audiA6.stop()
}