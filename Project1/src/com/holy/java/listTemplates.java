package com.holy.java;

import java.util.ArrayList;

public class listTemplates {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        //list.for
        for (Object o : list) {
            System.out.println(o);
        }

        //lit.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        //lit.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }
}
