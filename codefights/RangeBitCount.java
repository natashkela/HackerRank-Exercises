int rangeBitCount(int a, int b) {
    int numone=0;
    for(int i=a;i<=b;i++){
        String binary = Integer.toBinaryString(i);
        for(int j=0;j<binary.length();j++){
            if(binary.charAt(j)=='1'){
                numone++;
            }
        }
    }
    return numone;
}
