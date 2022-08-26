

int hammingDistance(int x, int y){
    int xCurr = x % 2, yCurr = y % 2;
    int dist = 0;
    if(xCurr != yCurr){
        dist++;
    }
    while(x > 0 || y > 0){
        if(x > 0){
            x /= 2;
            xCurr = x % 2;
        }
        if(y > 0){
            y /= 2;
            yCurr = y % 2;
        }
        if(xCurr != yCurr){
            dist++;
        }
    }
    return dist;
}
