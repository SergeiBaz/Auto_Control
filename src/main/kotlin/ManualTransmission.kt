class ManualTransmission: Transmission(){
    private var gear = Gears.Neutral

    fun switchGear(gear: Gears){
        this.gear = gear
    }
}