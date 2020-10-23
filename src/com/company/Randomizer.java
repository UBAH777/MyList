package com.company;

import java.util.Collection;

public class Randomizer {
    public static boolean randomInteger(Collection<Integer> collection, long number) {
        if (number < 0) {
            return false;
        }
        for (int i = 0; i < number; i++) {
            collection.add((int) (Math.random() * 100));
        }
        return true;
    }

    public static boolean randomDouble(Collection<Double> collection, long number) {
        if (number < 0) {
            return false;
        }
        for (int i = 0; i < number; i++) {
            collection.add((Math.random() * 100));
        }
        return true;
    }

    public static boolean randomString(Collection<String> collection, long number) {
        if (number < 0) {
            return false;
        }
        String s = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm";
        String c = "";
        for (int i = 0; i < number; i++) {
            c = "";
            for (int j = 0; j < 5; j++) {
                c += s.charAt((int) (Math.random() * 100));
            }
            collection.add(c);
        }
        return true;
    }
}