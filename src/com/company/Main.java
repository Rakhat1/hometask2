package com.company;


public class Main {

    public static String condition (int temp, int age) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30)
            return "Можно идти гулять";
        else if (age < 20 && temp > 0 && temp <28)
            return "Можно идти гулять";
        else if (age > 45 && (temp > -10 && temp < 25))
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";



    }

    public static void main (String args []){
        System.out.println(condition(-10, 15));
        System.out.println(condition(25, 30));
        System.out.println(condition(27, 2));
        System.out.println(condition(20, 50));
        System.out.println(condition(30, 60));

    }
}
