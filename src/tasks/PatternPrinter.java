package tasks;

import java.util.Scanner;

public class PatternPrinter {

    static void patternPrinter(int n) {
        // write your code here
      int range =n;
      for(int i=n;i>=1;i--){
          printRange(n,range);
              n--;
          System.out.print("\n");
      }
    }

public static void printRange(int n,int range){
    for(int j=n;j>=1;j--){
            System.out.print(range +" ");
    }
        if(range>1) {
            printRange(n, range - 1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        patternPrinter(n);
    }

}

