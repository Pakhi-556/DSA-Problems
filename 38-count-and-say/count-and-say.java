class Solution {
    public String countAndSay(int n) {
        ArrayList<String> arr=new ArrayList();
		if(n==1){
			return "1";
		} 

		arr.add("1");

		for(int i=2;i<=n;i++){
			String prev=arr.get(i-1-1);
			String curr="";

			for(int j=0;j<prev.length();j++){
				int count=1;
				while(j+1<prev.length() && prev.charAt(j)==prev.charAt(j+1)){
					count++;
					j++;
				}
                curr+=Integer.toString(count)+prev.charAt(j);
				
			}

			arr.add(curr);
		}

		return arr.get(n-1);
    }
}