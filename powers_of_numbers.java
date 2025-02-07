approach1:- using recursion
class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int rev=0;
        int val = n;
        if(n<10){
            rev = n;
        }else{
            while(n>0){
             rev = rev*10+(n%10);
             n/=10;
            }
        
        return reverse(0,val,rev);
    }
    private int reverse(int ans,int val,int exp){
        if(exp == 0){
            return ans;
        }
        return reverse(ans*val,val,rev--);
    }
}

approach 2 : using loop
class Solution {
    public int reverseExponentiation(int n) {
        // code here
        if(n==0)return 0;
        int rev=0;
        int val = n;
        if(n<10){
            rev = n;
        }else{
            while(n>0){
             rev = rev*10+(n%10);
             n/=10;
            }
        }

        int ans=1;
        for(int i=0; i<rev;i++){
            ans = ans*val;
        }
        return ans;
    }
}


// https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1?page=1&category=Recursion&sortBy=submissions