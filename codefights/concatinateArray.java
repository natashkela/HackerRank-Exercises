int[] concatenateArrays(int[] a, int[] b) {
    int size = a.length+b.length;
    int[] array = new int[size];
    for(int i=0;i<size;i++){
        if(i<a.length){
        array[i]=a[i];
        }
        else{
            array[i]=b[i-a.length];
        }
        
    }
    return array;
    
}
