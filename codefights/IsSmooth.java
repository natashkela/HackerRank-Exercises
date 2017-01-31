boolean isSmooth(int[] arr) {
    if(arr.length==0){
        return false;
    }
    if(arr.length==2){
        if(arr[0]==arr[1]){
            return true;
        }
    }
    int size = arr.length;
    if(size%2==0){
        int middle = arr[size/2]+arr[(size/2)-1];
        if(middle==arr[0]&&middle==arr[size-1]){
            return true;
        }
    }
    else{
        int middle = arr[size/2];
        System.out.println(middle);
        if(middle==arr[0]&&middle==arr[size-1]){
            return true;
        }
    }
    return false;
}
