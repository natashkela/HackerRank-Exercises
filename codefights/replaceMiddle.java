int[] replaceMiddle(int[] arr) {
    int[] array = new int[arr.length-1];
   if(arr.length%2==1){
       return arr;
   }
    else{
        int sum = arr[arr.length/2]+arr[(arr.length/2)-1];
        for(int i=0;i<array.length;i++){
            if(i==array.length/2){
                array[i]=sum;
            }
            else if(i<array.length/2){
                array[i] = arr[i];
            }
            else{
                array[i]=arr[i+1];
            }
        }
        return array;
    }
    
}
