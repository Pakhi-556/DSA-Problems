class Solution {
    public String largestNumber(int[] nums) {

        String arr[]=new String[nums.length];

        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }

return sb.charAt(0)=='0'?"0":sb.toString();
        
    }
}