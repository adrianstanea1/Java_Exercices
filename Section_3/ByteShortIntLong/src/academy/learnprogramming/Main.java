package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int value = 1000;

        int intMaxValue = Integer.MAX_VALUE;
        int intMinValue = Integer.MIN_VALUE;
        System.out.println("Min integer values = " + intMinValue);
        System.out.println("Max integer values = " + intMaxValue);
        System.out.println("Overflow = " + (intMaxValue + 1));
        System.out.println("Underflow = " + (intMinValue-1));

        int maxIntTest= 2147483647;

        byte  myMinByteValue = Byte.MIN_VALUE;
        byte  myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte max value = " + myMaxByteValue);
        System.out.println("Byte min value = " + myMinByteValue);


        short  myMinshortValue = Short.MIN_VALUE;
        short  myMaxshortValue = Short.MAX_VALUE;
        System.out.println("short max value = " + myMaxshortValue);
        System.out.println("short min value = " + myMinshortValue);

        long myLongValue=  100L;

        long  myMinLongValue = Long.MIN_VALUE;
        long  myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long max value = " + myMaxLongValue);
        System.out.println("Long min value = " + myMinLongValue);


        int myTotal = (intMinValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short)(myMinshortValue / 2);


//        Challenge
        byte byteNumber = 21;
        short  shortNumber = 124;
        int intNumber = 142145;
        long longNumber= 5000 + 10L*(byteNumber+shortNumber+intNumber);
        System.out.println(longNumber);
    }
}
