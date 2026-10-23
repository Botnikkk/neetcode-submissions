class Solution {
    public int maxArea(int[] heights) {
       int max = 0;
        int area = 0;
        
        int low = 0;
        int high = heights.length-1;
        while( low < high){
            area = (high - low) * Math.min(heights[low], heights[high]);
            if(heights[low] < heights[high]){
                low++;
            }else{
                high--;
            }

            if(area > max){ max = area ;}
        }
        return max; 
    }
}

