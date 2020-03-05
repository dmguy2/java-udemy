package com.company;

public class Main {

    public static void main(String[] args) {

        byte ByteVariable = 20;
        System.out.println(ByteVariable);

        short ShortVariable = 15;
        System.out.println(ShortVariable);

        int IntVariable = 10;
        System.out.println(IntVariable);

        long LongSum = (long) (50000 + (10 * (ByteVariable + ShortVariable + IntVariable)));

        System.out.println(LongSum);
    }
}
