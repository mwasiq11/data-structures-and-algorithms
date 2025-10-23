public class Binary {
    public static int BinarySearch(int [] arr, int target){
       int low=0;
       int high=arr.length-1;
       while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]==target){
               return mid;
           }
           else if(arr[mid]>target){
               high=mid-1;
           }
           else if(arr[mid]<target){
               low=mid+1;
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70,80,90,100};
        int target=100;
        int result=BinarySearch(arr,target);
        if(result==-1){
            System.out.println("Element not found ");
        }
        else{
            System.out.println("Element is found at index " +result);
        }
    }

}