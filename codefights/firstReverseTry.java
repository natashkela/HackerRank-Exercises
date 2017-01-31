int[] firstReverseTry(int[] arr) {
    if(arr.length==0||arr.length==1){
        return arr;
    }
    int temp;
    temp = arr[0];
    int size = arr.length - 1;
    System.out.println(size);
    arr[0]=arr[size];
    arr[size]=temp;
    return arr;
}
