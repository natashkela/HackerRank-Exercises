int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
   int result=0;
    if(value1>value2&&maxW-weight1>=0){
       int left = maxW-weight1;
       result+=value1;
        if(left-weight2>=0){
            result+=value2;
        }
   }
    else if(value2>value1&&maxW-weight2>=0){
       int left = maxW-weight2;
       result+=value2;
        if(left-weight1>=0){
            result+=value1;
        }
   }
    else if(value2>value1&&!(maxW-weight2>=0)){
        if(maxW-weight1>=0){
            result+=value1;
        }
        
    }
    else if(value1>value2&&!(maxW-weight1>=0)){
        if(maxW-weight2>=0){
            result+=value2;
        }
    }
    else if(value1==value2){
        if(maxW-weight1>=0||maxW-weight2>=0){
            result+=value1;
        }
    }
    return result;
}
