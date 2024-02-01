package java_day_08_practice;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {


        String name = "  chuck norris ";

        name = name.trim();
        name = name.substring(0,1).toUpperCase() + "." + name.substring(6,7).toUpperCase() + ".";
        System.out.println(name);

    }

}
