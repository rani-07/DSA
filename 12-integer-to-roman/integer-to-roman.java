class Solution {
    public String intToRoman(int num) {
    int [] intNum={
            1000, 900, 500, 400, 100, 90, 50, 40,
            10, 9, 5, 4, 1
        };
    String [] intchars= {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

    String result="";
    for(int i=0;i<intNum.length;i++){
        while(num>=intNum[i]){
            result+=intchars[i];
            num-=intNum[i];
        }
    }
     return result;
    }
   
}