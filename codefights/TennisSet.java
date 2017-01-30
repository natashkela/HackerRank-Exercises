boolean tennisSet(int score1, int score2) {
    if((score1==6&&score2<5)||(score2==6&&score1<5)){
        return true;
    }
    else if((score1>=5&&score2==score1+2)||(score2>=5&&score1==score2+2)){
        return true;
    }
    else if(score1>=6&&score2>=6&&Math.abs(score2-score1)==1){
        return true;
    }
    else{
        return false;
    }
}
