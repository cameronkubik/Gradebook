package com.kubik;

public class Printer {
    public static void pl(int preTextLines, String text, int postTextLines) {
        while(preTextLines > 0) {
            System.out.print("\n");
            preTextLines--;
        }

        System.out.println(text);

        while(postTextLines > 0) {
            System.out.print("\n");
            postTextLines--;
        }
    }

    public static void pr(String text) {
        System.out.print(text);
    }

    public static void displayOpening() {
        pl(1, "********************", 0);
        pl(0, "Welcome to Gradebook", 0);
        pl(0, "********************", 1);
    }
}

