class Solution {
    public boolean isIsomorphic(String str1, String str2) {
    /*HashMap<Character, Integer> charToIndex_s = new HashMap<>();
    HashMap<Character, Integer> charToIndex_t = new HashMap<>();

    for (Integer i = 0; i < s.length(); ++i)
      if (charToIndex_s.put(s.charAt(i), i) != charToIndex_t.put(t.charAt(i), i)){
        return false;
      }

    return true;*/

    
/*if(s.length()!=t.length()){
return false;
}


HashMap<Character,Character> map=new HashMap();
HashMap<Character,Boolean> c=new HashMap();

for(int i=0;i<s.length();i++){

if(map.containsKey(s.charAt(i))&&map.get(s.charAt(i)) != t.charAt(i)){

   return false;
}

if(!map.containsKey(s.charAt(i)) && c.containsKey(t.charAt(i))){
    return false;
}

map.put(s.charAt(i),t.charAt(i));
c.put(t.charAt(i),true);
}
return true;*/

HashMap<Character,Character> map=new HashMap();
        
        if(str1.length()!=str2.length()){
            return false;
        }
        
        for(int i=0;i<str1.length();i++){
            if(!map.isEmpty() && map.containsKey(str1.charAt(i))){
                if(map.get(str1.charAt(i))!=str2.charAt(i)){
                    return false;
                }
            }
            
            if(!map.containsKey(str1.charAt(i)) && map.containsValue(str2.charAt(i))){
                return false;
            }
            map.put(str1.charAt(i),str2.charAt(i));
        }
        
        
        return true;
        
    }
}