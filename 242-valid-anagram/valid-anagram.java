class Solution {
    public boolean isAnagram(String s, String t) {
       /* if(s.length()!=t.length()){
            return false;
        }
  int arr[]=new int[26];
for(int i=0;i<s.length();i++){

    arr[s.charAt(i)-'a']++;
    

}
for(int i=0;i<t.length();i++){

    arr[t.charAt(i)-'a']--;
    

}

for(int i:arr){
    if(i!=0){
        return false;
    }
}

return true;*/

if(s.length()!=t.length()){
    return false;
}

//creating a count array
int count[]=new int[26];

for(int i=0;i<s.length();i++){
    count[s.charAt(i)-'a']++;
    count[t.charAt(i)-'a']--;
}

for(int i:count){
    if(i!=0){
        return false;
    }
}


return true;
        
    }
}