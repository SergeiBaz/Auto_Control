class AutomobileWithManualTransmission: Automobile(){
    private val pedalClutch = Pedal()
    private val transmission = ManualTransmission()

    override fun moveStraight() {
        if (!ignition.isEnabled()) {
            ignition.enable()
        }

        pedalClutch.push()
        transmission.switchGear(Gears.First)
        pedalClutch.release()
        pedalGas.push()
    }

    override fun moveBackward() {
        if (!ignition.isEnabled()) {
            ignition.enable()
        }

        pedalClutch.push()
        transmission.switchGear(Gears.Reverse)
        pedalClutch.release()
        pedalGas.push()
    }

    override fun stop() {
        pedalClutch.push()
        transmission.switchGear(Gears.Neutral)
        pedalClutch.release()
        pedalBrake.push()
        ignition.disable()
    }

}