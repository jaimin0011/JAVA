package Array;

import java.util.*;

public class ReverseArray {
    public static void Reverse(int num[]) {

        int f = 0, l = num.length - 1;

        while (f < l) {
            // swap
            int temp = num[l];
            num[l] = num[f];
            num[f] = temp;

            f++;
            l--;
        }
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        Reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

    }
}
