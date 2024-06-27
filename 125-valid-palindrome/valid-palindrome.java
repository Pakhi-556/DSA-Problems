class Solution {
    public boolean isPalindrome(String s) {
        /*s=s.toLowerCase().trim();
        int left = 0;
        int right = s.length()-1;
        
        char l,r;
        while (left <= right){
            l = s.charAt(left);
            r = s.charAt(right);
            
            if (!((l >= 48 && l <= 57) || (l >= 97 && l <= 122 ))) {
                left++;
                continue;
            }
            if (!((r >= 48 && r <= 57) || (r >= 97 && r <= 122 ))) {
                right--;
                continue;
            }
            if (l != r) return false;
            left++; right--;
        }
        return true;*/

s=s.toLowerCase().trim();
int i=0;
int j=s.length()-1;
  
while(i<=j){

if(!((s.charAt(i)>=48 && s.charAt(i)<=57) ||(s.charAt(i)>=97 && s.charAt(i)<=122))){
  i++;
  continue; 
}

if(!((s.charAt(j)>=48 && s.charAt(j)<=57) ||(s.charAt(j)>=97 && s.charAt(j)<=122))){
   j--;
   continue;
}

if(s.charAt(i)!=s.charAt(j)){
return false;
}

i++;
j--;

}

return true;
    }
}