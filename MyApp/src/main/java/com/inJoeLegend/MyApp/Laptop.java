package com.inJoeLegend.MyApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Compiling with 404 bugs");
    }

    @Override
    public void decompile() {
        System.out.println("I am Abhi Wanted");
    }
}
