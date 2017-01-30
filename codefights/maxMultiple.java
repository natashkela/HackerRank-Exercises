int maxMultiple(int divisor, int bound) {
    int n=0;
    while((n+divisor)<=bound){
        n=n+divisor;
    }
    return n;
}
