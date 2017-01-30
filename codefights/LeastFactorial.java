int leastFactorial(int n) {
    int factorial=2;
    int result=1;
    while(result<n){
        result=result*factorial;
        factorial++;
    }
    return result;
}
