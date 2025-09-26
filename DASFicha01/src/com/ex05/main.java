package com.ex05;

public class main {
    public static void main(String[] args) {
        Captain captain1 = Captain.getCaptain();
        System.out.println("LAZY: Trying to make another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2) {
            System.out.println("LAZY: Both captain1 and captain2 are the same.");
        }

        Captain captain3 = Captain.getCaptainLazy();
        System.out.println("EARLY: Trying to make another captain for your team:");
        Captain captain4 = Captain.getCaptainLazy();
        if (captain3 == captain4) {
            System.out.println("EARLY: Both captain3 and captain4 are the same.");
        }
    }
}
