package com.soe.mit;

public class Demo {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=20;
        for(int i=0;i<arr.length;i++){
            arr[i]=i*3;
            System.out.println(arr[i]);
        }

    }
}
