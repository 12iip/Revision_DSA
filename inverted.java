public class inverted {
    public static void inverted_rotate_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotate_pyramid(5);
    }
}
