public class Main {
        public static class DynamicArray{
            int size;
            int count;
            int [] arr;

            DynamicArray(){
                this.size=1;
                this.count=0;
                this.arr=new int[size];
            }

            public void insert(int value){
                checkAndgrow();
                arr[count]=value;
                count++;
            }
            public void checkAndgrow(){
                if(count==size){
                    int [] tempArr=new int[size*2];
                    for(int i=0;i<size;i++){
                        tempArr[i]=arr[i];
                    }
                   arr=tempArr;
                    size=size*2;
                }

            }
            public void delete(){
                if(count==0){
                    System.out.println("Array is empty, cannot delete");
                    return;
                }
                count--;
            }

            public int get(int index){
                if(index<0 || index>=count){
                    throw new IndexOutOfBoundsException("Invalid index");
                }
                return arr[index];
            }

            public void display(){
                for(int i=0;i<count;i++){
                    System.out.println(arr[i]+ " ");

                }
                System.out.println();
            }

        }

    public static void main(String[] args) {
        DynamicArray Al = new DynamicArray();
        Al.insert(20);
        Al.insert(30);
        Al.insert(40);
        Al.insert(50);
        Al.delete();
        Al.display();
        System.out.println();

        System.out.println("Element at index 1: " + Al.get(1));
    }
}
