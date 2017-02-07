int isSumOfConsecutive2(int n) {
    int counter =0;
    for(int i=1;i<n;i++){
        int temp=i;
        int sum = 0;
            while(sum<=n){
                sum+=temp;
                temp++;
                if(sum==n){
                    counter++;
                }
            }
    }
    return counter;
}
