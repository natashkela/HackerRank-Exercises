boolean increaseNumberRoundness(int n) {
    String num = String.valueOf(n);
    for(int i=0;i<num.length()-1;i++){
        //System.out.println(num.charAt(i));
        //System.out.println(num.charAt(i+1));
        if(num.charAt(i)=='0'&&num.charAt(i+1)!='0'){
            return true;
        }
    }
    return false;
}
