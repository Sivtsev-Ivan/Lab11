package Lab11;

import java.util.Arrays;
import java.util.Scanner;

public class Massiv {
    private int[] intMas;
    private int n;

    public Massiv(int size) {
        n = size;
        intMas = new int[n];
    }

    public void enter() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            intMas[i] = sc.nextInt();
        }
    }

    public void print() {
        for (int currentValue : intMas)
            System.out.print(currentValue + " ");
        System.out.println();
    }

    public void sort() {
        Arrays.sort(intMas);
    }
}
