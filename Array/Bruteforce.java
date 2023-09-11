package Array;

//print Max subarray SUM
public class Bruteforce {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4 };
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) { // subarray sum
                    sum += num[k];
                }
                System.out.println(sum);

                if (maxsum < sum) {
                    maxsum = sum;
                }  
            }
        }
        System.out.println("Max sum : " + maxsum);

    }
}
