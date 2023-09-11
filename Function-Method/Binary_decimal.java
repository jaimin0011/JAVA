public class Binary_decimal {

     public static void binTodec(int Bin){
            int Mynum = Bin;
            int pow=0;
            int Dec=0;
            while(Bin > 0){
                int Lastdigit = Bin%10;
                Dec = Dec + (Lastdigit * (int)Math.pow(2,pow));
                pow++;
                Bin = Bin/10;
            }
            System.out.println("Decimal of "+ Mynum + " is " + Dec);
     }
     public static void main(String args[]){
        binTodec(101111);
     }
}
 