package com.kubik;

public class Menu {
    public static MenuStatus status = MenuStatus.SHOW;

    public static void beginRevolvingMenu() {
        Printer.printMenu();
    }
}
