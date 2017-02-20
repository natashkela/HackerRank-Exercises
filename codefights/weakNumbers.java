int[] weakNumbers(int n) {
    LinkedList<Integer> result=new LinkedList<Integer>();
    int weaknesses = 0, weaknest=0;
    for(int index=1;index<=n;index++) {
        int w = getWeakness(index);
        if(w>weaknest) {
            weaknest = w;
            weaknesses=1;
        }
        else if(w==weaknest)
            weaknesses++;
    }
    result.add(weaknest);
    result.add(weaknesses);
    int[] array = new int[result.size()];
    for(int i=0;i<result.size();i++){
        array[i]=(int)result.get(i);
    }
    return array;
}


int getWeakness(int n) {
    int count=0;
    if(n==1)
        return 0;
    int dN = getD(n);
    for(int i=1;i<n;i++) {
        if(getD(i)>dN)
            count++;
    }
    return count;
}
int getD(int n) {
    if(n==1)
        return 1;
    if(n==2)
        return 2;
    int count=0;
    int halfN = n/2;
    for(int i=2;i<=halfN;i++) {
        if(n%i==0)
            count++;
    }
    return count+2;
}
