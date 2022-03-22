package com.international.bank.demo.service;

import java.util.Arrays;
import java.util.stream.IntStream;

public class functionTest {
    public static void main(String args[]) {
        int[] data = {3, 5, 4, 8, 11, 1, 4, 6};
       for (int i= 0; i < data.length-1;i++){
           for (int j = 0; j < data.length-i-1 ; j++){
               if (data[j] > data[j +1]){
                   int temp = data[j];
                   data[j] = data[j+1];
                   data[j+1] = temp;


               }



           }
       }
        System.out.println(Arrays.toString(data));
    }
}
