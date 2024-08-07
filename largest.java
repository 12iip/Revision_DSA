public class largest {
    public static int getLargest(int[] number){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i<number.length; i++) {
            if(largest<number[i]){
                largest=number[i];
            }
            
        }
        return largest;

    }
    public static void main(String[] args) {
        int[] number= {10,12,13,15,19};
        System.out.println("The largest number in array is"+getLargest(number));
    }
    
}
