int countSumOfTwoRepresentations2(int n, int l, int r) {
    //bounds l to r
    //n is the sum
    int counter=0;
    for(int i=l;i<=r;i++){
        for(int j=i;j<=r;j++){
            if(i+j==n){
                //System.out.println(i);
                //System.out.println(j);
                counter++;
            }
            else if(i+j>n){
                break;
            }
        }
    }
    return counter;
}
