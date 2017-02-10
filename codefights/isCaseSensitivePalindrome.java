boolean isCaseInsensitivePalindrome(String inputString) {
    inputString = inputString.toLowerCase();
    String compare="";
    for(int i=inputString.length()-1;i>inputString.length()/2;i--){
        compare+=inputString.charAt(i);
    }
    System.out.println(compare);
    if(inputString.substring(0,inputString.length()/2).equals(compare)){
        return true;
    }
    else{
        return false;
    }
}
