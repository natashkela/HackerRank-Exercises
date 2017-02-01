int digitDistanceNumber(int n) {
    String result="";
    String s = String.valueOf(n);
    for(int i=1;i<s.length();i++){
        int a = Character.getNumericValue(s.charAt(i));
        int b = Character.getNumericValue(s.charAt(i-1));
        int res = Math.abs(a-b);
        result+=Integer.toString(res);
    }
    
    System.out.println(result);
    int fin = Integer.parseInt(result);
    return fin;
}
