package com.example.streams;

public class VolatileExample {

    private volatile boolean flag = false;

    public void setFlagTrue() {
        flag = true; // This write will be immediately visible to other threads
    }

    public void waitForFlag() {
        while (!flag) {
            // Spin-wait until flag becomes true
        }
        System.out.println("Flag is now true!");
    }
}
