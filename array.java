import java.util.*;
public class array {
    public static void main(String[] args) {
        int per;
        int[] marks= new int[100];
        Scanner sc= new Scanner(System.in);
        marks[0]= 25;
        marks[1]=22;
        marks[2]=21;
        System.out.println("Phy marks is=" +marks[0]);
        System.out.println("chem marks is=" +marks[1]);
        System.out.println("mat marks is=" +marks[2]);
        per=((marks[0]+marks[1]+marks[2])/3);
        System.out.println("percentge of marks is="+per);
        System.out.println("The array length is"+marks.length);

    }
}
