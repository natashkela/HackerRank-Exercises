int appleBoxes(int k) {
    int red = 0;
    int yellow = 0;
    for(int i=1;i<=k;i++){
        if(i%2==0){
            red=red+(i*i);
        }
        else {
            yellow=yellow+(i*i);
        }
    }
    return red-yellow;
}
