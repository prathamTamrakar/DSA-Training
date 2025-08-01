public class ContainerWithMostWater{

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int h = Math.min(height[left],height[right]);
            int width = right - left;
            int area = h * width;
            maxArea = Math.max(maxArea,area);
            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        
        int[] height = {1,8,6,2,5,4,8,3,7};
        int answer = maxArea(height);
        System.out.println(answer);


        // if(height.length==2){
        //     if(height[0]<height[1]){
        //         maxArea = height[0];
        //     } else {
        //          maxArea = height[1];
        //     }
        // }
        // for(int i=0;i<height.length-1;i++){
        //     int count = 0;
        //     for(int j=i+1;j<height.length;j++){
        //         count++;
        //         if(height[i]<height[j]){
        //             int area = count*height[i];
        //         if(area>maxArea){
        //             maxArea = area;
        //         }
        //         } else {
        //         int area = count*height[j];
        //         if(area>maxArea){
        //             maxArea = area;
        //         }
        //         }
        //     }
        // }
        // return maxArea;





    }
}