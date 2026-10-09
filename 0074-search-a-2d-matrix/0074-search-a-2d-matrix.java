class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left  = 0;
        int right = n*m-1;

        while(left<= right)
        {
            int mid = (right+left)/2;
            
            int row = mid/n;
            int col = mid%n;

            if(matrix[row][col] == target)
            {
                return  true;
            }

            if(matrix[row][col] > target)
            {
                right = mid - 1;
            }
            else
            {
                left  = mid + 1;
            }
        }
        return false;
    }
}