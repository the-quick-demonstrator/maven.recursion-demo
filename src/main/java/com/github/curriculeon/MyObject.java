package com.github.curriculeon;

public class MyObject implements Runnable {
    public void run() {
        int x = 0;
        while (true) {
            if (x >= 3) {
                break;
            }
            System.out.println("Hello world");
            x++;
        }

//        x = 0;
//        if(x <= 3) {
//            GOTO line-20
//        } else {
//            x = x + 1
//            GOTO line-14
//        }
    }
}
