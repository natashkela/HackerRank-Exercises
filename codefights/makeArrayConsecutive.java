int makeArrayConsecutive2(int[] a) {
    Arrays.sort(a);
    int result=0;
    for(int i=1;i<a.length;i++){
        if(a[i]-a[i-1]>1){
            result+=a[i]-a[i-1]-1;
        }
    }
    return result;
}
