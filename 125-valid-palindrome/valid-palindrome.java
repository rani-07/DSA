class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                str+=ch;
            }
            
           
        }
        int right=0;
        int left=str.length()-1;
         while(right<left){
            if(str.charAt(right)!=str.charAt(left)){
                return false;

            }
           right++;
           left--;
         }
         return true;
    }
}