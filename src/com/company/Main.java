
package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {4, 421, 64, 756, 3, -5, 3, -123};
        for (int i = 0; i < array.length; i++) {
            if (i > array[i]) {
                array[0] = array[i];
            }
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}



