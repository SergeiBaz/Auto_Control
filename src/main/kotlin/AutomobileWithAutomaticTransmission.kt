class AutomobileWithAutomaticTransmission: Automobile() {
    private val transmission = AutomaticTransmission()

    override fun moveStraight() {
        ignition.enable()
        pedalBrake.push()
        transmission.switchSelector(SelectorMode.Drive)
        pedalBrake.release()
        pedalGas.push()
    }

    override fun moveBackward(){
        ignition.enable()
        pedalBrake.push()
        transmission.switchSelector(SelectorMode.Reverse)
        pedalBrake.release()
        pedalGas.push()
    }

    override fun stop(){
        pedalGas.release()
        pedalBrake.push()
        transmission.switchSelector(SelectorMode.Parking)
        pedalBrake.release()
        ignition.disable()
    }


}