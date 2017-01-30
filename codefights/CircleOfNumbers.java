int circleOfNumbers(int n, int firstNumber) {
    int yo = n/2;
    System.out.println(yo);
    System.out.println(firstNumber);
    int result = firstNumber+yo;
    if(result>=n){
        result = result -n;
    }
    return result;
}
