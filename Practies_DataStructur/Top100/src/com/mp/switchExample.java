package com.mp;

public class switchExample {

	static int score = 4;
    public static void main(String args[]) {
        switch (score) {
            case 1:
                System.out.println("Score is 1");
                break;
            case 2:
                System.out.println("Score is 2");
                break;
            default:
                System.out.println("Default Case");
        }
    }
}
