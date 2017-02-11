String htmlEndTagByStartTag(String startTag) {
    String answer="";
    for(int i=0;i<startTag.length();i++){
        
        if(i==startTag.length()-1){
            return startTag.substring(0,1)+"/"+startTag.substring(1);
        }
        else if((int)startTag.charAt(i)!=32){
            answer+=startTag.charAt(i);
        }
        else{
            break;
        }
    }
    System.out.println(answer);
    answer = answer.substring(0,1)+"/"+answer.substring(1)+">";
    return answer;
}
