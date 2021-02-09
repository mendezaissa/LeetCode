//Number of Students Doing Homework at a Given Time
// 111 / 111 test cases passed.
// Status: Accepted
// Runtime: 1 ms

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        
        int count = 0;
        System.out.println(queryTime);
        
        for(int i = 0; i < startTime.length; i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                count = count + 1;
            }
        }
        return count;
    }
}