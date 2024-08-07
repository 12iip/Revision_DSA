public class array1 {
    public static void update(int marks[],int nonChangable){
        for(int i=0;i<marks.length;i++){
            marks[i]= marks[i]+1;
            nonChangable=9;
        }
    }
    public static void main(String[] args) {
        int marks[]={10,20,22};
        int nonChangable= 8;

        
        update(marks,nonChangable);
        for(int i=0;i<marks.length;i++){
        System.out.println("the marks are"+marks[i]);
        }
        System.out.println("the value is"+nonChangable);

        System.out.println();
    }

    
}
