boolean isPower(int n) {
    if(n==1){
        return true;
    }
    else{
        for(int i=2;i<n;i++){
            if(n%i==0){
                int temp = n;
                while(temp%i==0){
                    temp=temp/i;
                }
                if(temp==1){
                    return true;
                }
            }
        }
        return false;
    }
}
