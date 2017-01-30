int[] metroCard(int lastNumberOfDays) {
    int[] array;
    if(lastNumberOfDays==30){
        array = new int[1];
        array[0]=31;
    }
    else{
        array=new int[3];
        array[0]=28;
        array[1]=30;
        array[2]=31;
    }
    return array;
}
