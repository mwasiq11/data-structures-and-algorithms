                            // 1D Array
//public class Array {
//    public static void main(String[] args) {
//       int arr[]={1,2,3,4,5};
//       for (int i=0;i<arr.length;i++){
//           System.out.println("the element of the array is:" +arr[i]);
//       }
//
//    }
//}
                           // 2D Array
//public class Array {
//    public static void main(String[] args) {
//        int arr [][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12,45}};
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//               System.out.print(arr[i][j]+" ");
//            }
//            System.out.println(" ");
//        }
//
//    }
//}
// question: write a program to calculate average and sum of array using loops
//public class Array {
//    public static void main(String[] args) {
//        int sum=0;
//        float avg;
//        float count=0;
//        int num[]={12,23,34,35,11};
//        for (int i=0;i<num.length;i++){
//            sum+=num[i];
//            count++;
//        }
//        System.out.println("sum=" +sum);
//        avg=sum/count;
//        System.out.println("avg="+avg);
//
//    }
//}

// question: write a program to find sum and avg from 2D array
//public class Array {
//    public static void main(String[] args) {
//        int arr [][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12,45}};
//        float sum=0;
//        float avg=0;
//        float count=0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                sum+=arr[i][j];
//                System.out.println("sum:"+sum);
//                count++;
//            }
//            avg=sum/count;
//            System.out.println("sum:"+sum);
//            System.out.println("avg"+avg);
//        }

// Write a program in Java that initializes two arrays A and B. The program should create, calculate
// and display the contents of array C as following.

public class Array{
    public static void main(String[] args) {
        double arrA[]={25,14,12,74,58,74,98,84,15,24};
        double arrB[]={87,11,10,81,67,94,74,82,15,87};
        double storedArr=100.00;
        double arrC;
        double sub_arr;
        for (int i=0;i<arrA.length;i++){
            sub_arr=arrA[i]/storedArr;
            arrC=sub_arr+arrB[i];
            System.out.println("final output of the array is:"+arrC);
        }

    }
}