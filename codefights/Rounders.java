int rounders(int value) {
    String num = String.valueOf(value);
    String answer="";
    String[] array = new String[num.length()];
    array = num.split("");
    for(int i=num.length()-1;i>0;i--){
        //int num2 = Character.getNumericValue(num.charAt(i));
        //int num1 = Character.getNumericValue(num.charAt(i-1));
        int num2 = Integer.parseInt(array[i]);
        int num1 = Integer.parseInt(array[i-1]);
        if(num2>=5){
            num2=0;
            num1++;
        }
        else if(num2!=0){
            num2=0;
        }
        array[i]=String.valueOf(num2);
        array[i-1]=String.valueOf(num1);
        
    }
    for(int i=0;i<num.length();i++){
        answer+=array[i];
        System.out.println(array[i]);
    }
    int ans = Integer.parseInt(answer);
    return ans;
}
