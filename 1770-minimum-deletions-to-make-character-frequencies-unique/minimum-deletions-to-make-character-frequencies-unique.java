class Solution {
    public int minDeletions(String str) {
        int ch[]=new int[26];

        for(int i=0;i<str.length();i++){
			ch[str.charAt(i)-'a']++;
		}

		Arrays.sort(ch);

        int count=0;
        
		HashSet<Integer> set=new HashSet();

		for(int i=0;i<ch.length;i++){
            if(!set.contains(ch[i])){
				set.add(ch[i]);
			}else{
				int v=ch[i];
				while(v>0 && set.contains(v)){
					v--;
					count++;
				}

				set.add(v);
			}
		}


		return count;

    }
}