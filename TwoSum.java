
import java.util.*;
class TwoSum {
   
        public static int[] twoSum(int n, int arr[], int target){
            int ans[] = new int[2];
            ans[0] = ans[1] = -1;
            HashMap<Integer, Integer> mpp = new HashMap<>();
            for(int i = 0; i < n; i++){
            int more = target-arr[i];
            if(mpp.containsKey(more)){
                ans[0] = mpp.get(more);
                ans[1] = i;
               return ans;
            }
            mpp.put(arr[i],i);
            }
            return ans;
            
        }
         public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int n = arr.length;
        int target = 14;
         int ans[] = twoSum(n,arr,target);
        System.out.println("final index [" + ans[0] +","+ans[1]+"]");
    }
}
