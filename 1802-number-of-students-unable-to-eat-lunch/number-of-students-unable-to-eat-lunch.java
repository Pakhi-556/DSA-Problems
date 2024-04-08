class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        /*Queue<Integer> q=new LinkedList();

        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }


        for(int i=0;i<sandwiches.length;i++){
            int s=q.size();
            boolean found=false;
            for(int j=0;i<s;j++){
                int curr=q.remove();

                if(sandwiches[i]==curr){
                    found=true;
                    break;
                }
                else{
                  q.add(curr);
                }
            }

            if(!found){
                return q.size();
            }
        }

        return 0;*/

        int count[]=new int[2];
        for(int s:students){
            count[s]++;
        }

        for(int sandwich:sandwiches){
            if(count[sandwich]==0){
                break;
            }

            count[sandwich]--;
        }
        return count[0]+count[1];
    }
}