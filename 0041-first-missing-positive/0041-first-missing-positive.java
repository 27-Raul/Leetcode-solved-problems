class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n = nums.length;
        int i = 0;
        while(i<n)
        {
            int curidx = nums[i] - 1;
            if(nums[i] > 0 && nums[i]<= n && nums[i] != nums[curidx] )
            {
                swap(nums,i,curidx);
            }

            else
            {
                i++;
            }
        }

        for(i=0;i<n;i++)
        {
            if(nums[i] != i + 1)
            {
                return i + 1;
            }
        }
        return n+1;

    }

    private void swap(int[] nums,int idx1,int idx2)
    {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}