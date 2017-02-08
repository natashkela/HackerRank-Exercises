int pagesNumberingWithInk(int current, int numberOfDigits) {
    String a = String.valueOf(current);
    int hey=a.length();
    //int counter=0;
    int left = a.length();
    while(numberOfDigits>=left){         
        a = String.valueOf(current);
        left = a.length();
        numberOfDigits -=left;
        current++;
    }
    return current-1;
}
