// @author JZ-FSDev
// Runtime: 54 ms, faster than 93.12% of C online submissions for Reverse String.

// Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory.

void reverseString(char* s, int sSize){
    char c;
    for(int i = 0; i < sSize / 2; i++){
        c = s[i];
        s[i] = s[sSize - i - 1];
        s[sSize - i - 1] = c;
    }
}
