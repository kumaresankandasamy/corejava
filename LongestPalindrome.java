class Solution {
    public int longestPalindrome(String s) {
        int charArr[] = new int[52];
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                charArr[s.charAt(i) - 'a']++;
            }
            else{
                charArr[26+s.charAt(i) - 'A']++;
            }
        }
        int total = 0;
        int tot = 0;
        for(int i=0;i<52;i++){
            if(charArr[i]!=0){
                if(charArr[i]%2==0){
                    total = total+charArr[i];
                }
                else
                {
                    if(tot==0){
                        total=total+charArr[i];
                        tot++;
                }
                else{
                    total=total+charArr[i]-1;
                }
             }
          }
        }
       return total; 
    }
}
