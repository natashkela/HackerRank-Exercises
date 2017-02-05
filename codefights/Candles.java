int candles(int candlesNumber, int makeNew) {
    int leftover =0;
    int numberBurned = 0;
    while(candlesNumber>0){
        numberBurned += candlesNumber;
        leftover+=candlesNumber;
        candlesNumber=leftover/makeNew;
        leftover = leftover%makeNew;
    }
    return numberBurned;
    
}
