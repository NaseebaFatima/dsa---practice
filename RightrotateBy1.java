
public class RightrotateBy1 {
          

    public static void RrotateBy1(int n,int arr[]){
        int temp = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            arr[i+1] = arr[i];
            
        }
        arr[0] = temp;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        RrotateBy1(n,arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
            
        }
        
        
    }
}
    
