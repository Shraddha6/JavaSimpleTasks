package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MissingNumberFinder {

    static int missingNumberFinder(int array[], int n) {
        // write your code here
        int range = 1;
        Arrays.sort(array);
        List<Integer> intList = Arrays.stream(array).boxed().collect(Collectors.toList());
        for(int i=0 ; i<n; i++,range++){
            if(!(intList.contains(range))){
                 return range;
            }
        }
        return range;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in .nextInt();
        int[] arr = new int[size - 1];
        for (int i = 0; i < size - 1; i++) arr[i] = in .nextInt();
        System.out.println(missingNumberFinder(arr, size));
    }
}
