int mirrorBits(int a) {
    String binary = Integer.toBinaryString(a);
    String newstr="";
    for(int i=binary.length()-1;i>=0;i--){
        newstr+=binary.charAt(i);
    }
    int answer = Integer.parseInt(newstr,2);
    return answer;
}
