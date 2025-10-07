import java.util.*;

public class Main {
    public static void main(String[] args) {
    int arr[]={23,12,123,34,78,7,122,66};
    int temp;
    for (int i=0;i<arr.length;i++){
        for (int j=0;j<arr.length-1;j++){
            if (arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
        System.out.println("sorted array is " + Arrays.toString(arr));
    }
}