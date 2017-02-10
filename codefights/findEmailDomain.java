String findEmailDomain(String address) {
    int i = address.length()-1;
    String reverse = "";
    while(address.charAt(i)!='@'){
        reverse+=address.charAt(i);
        i--;
    }
    String answer="";
    for(i=reverse.length()-1;i>=0;i--){
        answer+=reverse.charAt(i);
    }
    return answer;
}
