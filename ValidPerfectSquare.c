// @author JZ-FSDev
// Runtime: 0 ms, faster than 100.00% of C online submissions for Valid Perfect Square.

// Given a positive integer num, write a function which returns True if num is a perfect square else False.
// Follow up: Do not use any built-in library function such as sqrt.

bool isPerfectSquare(int num){
    bool perfect = false;
    
    for(int i = 1; i <= 46340 && !perfect; i++){
        if(i * i == num){
            perfect = true;
        }
    }
    return perfect;
}
