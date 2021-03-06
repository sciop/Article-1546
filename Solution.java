class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        Set<Integer> complements = new HashSet();
        complements.add(0);
        int answer = 0, sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(complements.contains(sum - target)) {
                answer++;
                complements = new HashSet();
                sum = 0;
            }
            complements.add(sum);
        }
        return answer;
    }
}
