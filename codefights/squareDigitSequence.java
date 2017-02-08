int squareDigitsSequence(int a0) {
    if(a0==1){
        return 2;
    }
    else{
        int counter=0;
        LinkedList<Integer> list = new LinkedList<Integer>();
        int sum = -1;
        while(!list.contains(sum)){
            if(counter==0){
                sum = a0;
                list.add(sum);
            }
            counter++;
            list.add(sum);
            String val = String.valueOf(list.getLast());
            char[] array = val.toCharArray();
            sum=0;
            for(int i=0;i<array.length;i++){
                int x=Character.getNumericValue(array[i]);
                sum=sum+(x*x);
            }
        }
        return list.size();
    }
}
