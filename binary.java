public class binary {
    public static int binaysearch(int number[], int key){
        int start=0; int end=number.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start= mid+1;
            }
            else{
                end= mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {10,20,30,40,50,60,70,80,90};
        int key= 10;
        System.out.println("the index of the number is"+binaysearch(number, 10));
    }
}
