//  if same number present in array then return true otherwise false
public class SameNum {
    public static int duplicate(int [] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return 1;
                }
            }
        }return 0;
        
    }

    public static void main(String[] args) {
        int num[] = { 3, 2, 8, 5, 6, 3 };
        if(duplicate(num)==1){
            System.out.println("duplicate found");
        }else{
            System.out.println("No duplicate");
        }
        

    }

}
