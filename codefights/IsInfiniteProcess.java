boolean isInfiniteProcess(int a, int b) {
    if((Math.abs(a-b)<=2||Math.abs(a-b)==5)&&a!=b){
        return true;
    }
    else{
        return false;
    }
}
