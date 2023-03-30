class AutomaticTransmission : Transmission(){
    private var selectorMode = SelectorMode.Neutral

    fun switchSelector(selectorMode: SelectorMode){
        this.selectorMode = selectorMode
    }
}