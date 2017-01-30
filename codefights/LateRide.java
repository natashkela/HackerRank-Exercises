int lateRide(int n) {
    int minutesOut = n%60;
    int hours = n/60;
    String min = String.valueOf(minutesOut);
    String hour = String.valueOf(hours);
    int minSum=0;
    int hourSum=0;
    for(int i=0;i<min.length();i++){
        int a = Character.getNumericValue(min.charAt(i));
        minSum+=a;
    }
    for(int i=0;i<hour.length();i++){
        int a = Character.getNumericValue(hour.charAt(i));
        hourSum+=a;
    }
    
    int result = minSum+hourSum;
    return result;
}
