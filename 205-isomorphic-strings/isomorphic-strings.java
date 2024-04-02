class Solution {
    public boolean isIsomorphic(String s, String t) {
    /*HashMap<Character, Integer> charToIndex_s = new HashMap<>();
    HashMap<Character, Integer> charToIndex_t = new HashMap<>();

    for (Integer i = 0; i < s.length(); ++i)
      if (charToIndex_s.put(s.charAt(i), i) != charToIndex_t.put(t.charAt(i), i)){
        return false;
      }

    return true;*/

    
if(s.length()!=t.length()){
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
return true;
        
    }
}