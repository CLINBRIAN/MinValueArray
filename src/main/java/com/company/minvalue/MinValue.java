/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.minvalue;

/**
 *
 * @author kamau
 */
public class MinValue {

    public static void main(String[] args) {
        int[] array = {2, 4, 5,1, 7, 8};
        int minValue = array[0];

        for (int i : array) {
            if (i < minValue) {
                minValue = i;
            }
        }
        System.out.println(minValue);
    }
}
