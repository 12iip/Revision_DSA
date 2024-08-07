public class linearsearch {
    public static int linearsearch(int[] number, int key){
        for(int i=0;i<number.length;i++){
        if(number[i]==key){
            return i;
        }
   }
    return -1 ;
   }

    public static void main(String[] args) {
        int[] number= {10,11,12,13,14,15,16,17,18};
    int key=11;

    int index= linearsearch(number, key);
    if(index==-1){
        System.out.println("Not found");
    }
    else{
        System.out.println("the index is "+index);
    }

    }
    
}

