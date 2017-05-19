package me.shellj.learn.algorithm;

import java.util.Arrays;

/**
 * Created by shellj on 2017/5/19.
 */
public class InsertionSort {
    public void sort(int[] items) {
        for (int i = 1; i < items.length; i++) {
            if (items[i - 1] > items[i]) {
                int temp = items[i];
                int j = i;
                //每比较一次数据向后移一次，留出合适空间直接插入
                while (j > 0 && items[j - 1] > temp) {
                    items[j] = items[j - 1];
                    j--;
                }
                items[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = TestData.unsortedData();
        new InsertionSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
