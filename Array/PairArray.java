package Array;

public class PairArray {

    public static void Pair(int num[]) {
        int tp = 0; // total pair
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];// 1,2,3,4,5
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total pair is : " + tp);
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5 };
        Pair(num);

    }
}