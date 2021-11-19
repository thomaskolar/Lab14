
package com.mycompany.lab14;


public class Main {
    
    public static void main(String[] args) {

        Materials paper = new Materials.Builder("Hard","light-weight","opaque","Rigid")
        .recyclable(true)
        .build();
        System.out.println(paper);
    }
    
}
