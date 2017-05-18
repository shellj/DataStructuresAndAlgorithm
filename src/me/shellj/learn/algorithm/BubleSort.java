package me.shellj.learn.algorithm;

import java.util.Arrays;

/**
 * Created by shellj on 2017/5/18.
 */
public class BubleSort {
    public void sort(int[] items) {
        if (items == null || items.length < 2) {
            return;
        }
        for (int i = 0; i < items.length - 2; i++) {
            for (int j = 0; j < items.length - 1 - i; j++) {
                if (items[j] > items[j + 1]) {
                    int temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{23, 1, 33, -123, 545, 123, 6, 12, 1, 1};
        new BubleSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
