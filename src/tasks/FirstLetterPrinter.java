package tasks;

import java.util.Scanner;

public class FirstLetterPrinter {

    public static String firstLetterPrinter(String data){
        String[] splittedString= data.split(" ");
        StringBuilder finalString = new StringBuilder();
        for(int i=0;i<splittedString.length;i++) {
            char[] charArray = splittedString[i].toCharArray();
            finalString.append(charArray[0]);
        }
    return finalString.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in .nextLine();
        System.out.println(firstLetterPrinter(input));
    }
}
