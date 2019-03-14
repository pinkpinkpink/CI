package src.main.java.org.func.entity;

import java.util.Scanner;

public class EnumTest {

    public static void main(String[] args) {
        Scanner in = new Scanner("");
        System.out.println("enter a size:(SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
    }

    public enum Size {
        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
        private String abbr;

        private Size(String abbr) {
            this.abbr = abbr;
        }

        public String getAbbr() {
            return abbr;
        }

        //TODO toString() 返回枚举常量名



    }
}