public class Linear {
        public static int LinearSearch(int [] arr, int target){
           for(int i=0;i<arr.length;i++){
               if(arr[i]==target){
                   return i;
               }
           }
           return -1;
        }
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70,80,90,100};
        int target=50;
        int result=LinearSearch(arr,target);
        if (result==-1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element fount at index " + result);
        }
    }

}


