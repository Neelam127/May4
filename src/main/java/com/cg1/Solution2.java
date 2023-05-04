
package com.cg1;


/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.*/

public class Solution2 {
	public int reverse(int x) {
        
        
        int copy=x;
        long rev=0;

        while(copy!=0){
            int rem=copy%10;
            rev=rev*10 + rem;
            copy= copy/10;
        }
        if(rev>=Integer.MIN_VALUE && rev<=Integer.MAX_VALUE ){
            return (int)rev;
        }
        return 0;
    
    
}
}
