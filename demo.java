class calculator{
        public int add(int n1,int n2){
            return n1+n2;
        }
        public int add(int n1, int n2, int n3){
            return n1+n2+n3;
        }
}

public class demo{
    public static void main(String[] args) {
        calculator obj= new calculator();
        int r1= obj.add(20, 30,30);
        System.err.print(r1);
    }
}