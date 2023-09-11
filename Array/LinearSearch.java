package Array;

public class LinearSearch {


    public static int  linearSearch(int num[],int key){
            for(int i=0;i<num.length;i++){
                if(num[i]==key){
                    return i;
                }
            }
            return -1;
    }
    public static void main(String [] args){
        int num[] = {1,2,4,5,6,7,8,9};
        int key = 4;
        
        int result =linearSearch(num, key);
        if(result == -1){
            System.out.println(key + " is not FOUND");
        }else{
            System.out.println("key is FOUND at " + result);
        }


    }
}
