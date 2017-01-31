int[] removeArrayPart(int[] inputArray, int l, int r) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    for(int i=0;i<inputArray.length;i++){
        if(i>=l&&i<=r){
            
        }
        else{
            list.add(inputArray[i]);
        }
    }
    int[] array = new int[list.size()];
    for(int i=0;i<list.size();i++){
        array[i]=list.get(i);
    }
    return array;
}
