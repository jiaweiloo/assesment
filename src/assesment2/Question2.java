/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesment2;

/**
 *
 * @author JJzaii
 */
public class Question2 {

    public static void ReservePrint(String[] str, int index) {
        if (index != str.length) {
            ReservePrint(str, index + 1);
            System.out.println(str[index]);
        }

    }

    public static void main(String[] args) {
        String myStrings[];
        myStrings = new String[]{"One", "Two", "Three"};
        ReservePrint(myStrings, 0);
    }
}
