int arrayPacking(int[] a) {
    String[] array = new String[a.length];
    
    for(int i=0;i<a.length;i++){
        String str = Integer.toBinaryString(a[i]);
        System.out.println("---"+str);
        if(str.length()>8){
            str = str.substring(0,8);
            array[i]=str;
        }
        else{
            String lack="";
            for(int j=0;j<(8-str.length());j++){
                lack += "0";
            }
            str=lack+str;
            System.out.println(str);
            array[i]=str;
        }
        //System.out.println(array[i]);
    }
    String bigString = "";
    for(int i=array.length-1;i>=0;i--){
        bigString+=array[i];
    }
    int answer = Integer.parseInt(bigString,2);
    return answer;
    
}
