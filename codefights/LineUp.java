int lineUp(String commands) {
    int counter=0;
    int[] array = {0,0};
    //if 180 or 360 everyone then perect
    for(int i=0;i<commands.length();i++){
        if(commands.charAt(i)=='L'){
            array[0]+=-90;
            array[1]+=90;
            
        }
        else if(commands.charAt(i)=='R'){
            array[0]+=90;
            array[1]+=-90;
        }
        else{
            array[0]+=360;
            array[1]+=360;
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        if(array[0]%360==(array[1]%360)||
           (Math.abs(array[0])%180==0&&
           Math.abs(array[1])%180==0)
           ){
             counter++;
        }
    }
    return counter;
}
