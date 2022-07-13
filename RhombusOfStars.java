package Abstraction;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());//3
        String symbol = "";

        for (int row = 1; row <= n; row++) {
            forEach(n," ", row);

            forEach(row,"* ");

            System.out.println();
        }
        for (int row = 1; row <= n - 1 ; row++) {
            forEach(row," ");

            forEach (n,"* ",row);

            System.out.println();
        }
    }
    
    private static void forEach (int n, String symbol,int row) {
        for (int col = 0; col < n - row; col++) {
            System.out.print(symbol);
        }
    }

    private static void forEach (int row, String symbol){
        for (int col = 0; col < row; col++) {
            System.out.print(symbol);
        }
    }



}
