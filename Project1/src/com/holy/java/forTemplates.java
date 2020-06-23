package com.holy.java;

public class forTemplates {
    public static void main(String[] args) {

        String[] arr = new String[]{"tom", "jerrt", "hanmeimei"};

        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //iter
        for (String s : arr) {
            System.out.println(s);
        }

        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

    }
}
