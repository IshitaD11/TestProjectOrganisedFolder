package com.sample.organised;

import com.sample.otherfolder.OtherClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inside main");
        OtherClass oc = new OtherClass(5);
        oc.Print();
    }
}
