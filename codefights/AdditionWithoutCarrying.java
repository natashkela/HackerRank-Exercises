int additionWithoutCarrying(int param1, int param2) {
    String num1 = String.valueOf(param1);
    String num2 = String.valueOf(param2);
    if(num1.length()==num2.length()){
        
        return add(num1,num2);
    }
    else if(num1.length()<num2.length()){
        int missing = num2.length()-num1.length();
        String str="";
        for(int i=0;i<missing;i++){
            str+="0";
        }
        num1 = str+num1;
        return add(num1,num2);
    }
    else{
        int missing = num1.length()-num2.length();
        String str="";
        for(int i=0;i<missing;i++){
            str+="0";
        }
        num2 = str+num2;
        return add(num1,num2);
    }
}

int add(String num1, String num2){
    String answer="0";
    for(int i=num1.length()-1;i>=0;i--){
        String carry = "";
        int sum = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i));
        if(sum>9){
            String a = String.valueOf(sum);
            carry = Character.toString(a.charAt(a.length()-1));
            answer=carry+answer;
        }
        else{
            String a = String.valueOf(sum);
            answer=a+answer;
            System.out.println(answer);
        }
        //System.out.println(sum);
        //System.out.println(answer);
    }
    if(answer.length()>1){
        answer = answer.substring(0,answer.length()-1);
    }
    int result = Integer.parseInt(answer);
    return result;
    
}
