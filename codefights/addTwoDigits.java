int addTwoDigits(int n) {
    String str = String.valueOf(n);
    int result =0;
    for(int i=0;i<str.length();i++){
        int num = Character.getNumericValue(str.charAt(i));
        result+=num;
    }
    return result;
}
