// bubblesort 
package Sorting;
import java.util.*;
public class BubbleSort {

    public static void sorting(int arr[]){
        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j =0;j<arr.length-1-turn;j++){
                    if(arr[j] > arr[j+1]){
                              int temp = arr[j];            
                              arr[j] = arr[j+1];
                              arr[j+1] = temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");

        }System.out.println();
    }
    public static void main(String []args){
        int arr[] = {5,4,8,9,6,3};
            sorting(arr);
            printarr(arr);

    }
}