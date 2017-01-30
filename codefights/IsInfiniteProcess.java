boolean isInfiniteProcess(int a, int b) {
    if(a>b||(b - a) % 2 != 0){
        return true;
    }
    else{
        return false;
    }
}
