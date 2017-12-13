/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesment2;

import java.util.Scanner;

/**
 *
 * @author JJzaii
 */
public class Assesment2 {

    /**
     * @param args the command line arguments
     */
    public static void CountUp(int x) {
        if (x > 1) {
            CountUp(x - 1);
            System.out.println(x);
        } else {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer number: ");
        int number = scanner.nextInt();

        System.out.printf("\nOutput for countDown(%d):\n", number);
        CountUp(number);
    }

}
