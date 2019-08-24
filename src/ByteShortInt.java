public class ByteShortInt {
    public ByteShortInt() {
        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum Value of Integer is : " + myMinIntValue);
        System.out.println("Maximum Value of Integer is : " + myMaxIntValue);
        System.out.println("Busted MAX value = " + myMaxIntValue + 1);
        System.out.println("Busted MIN value = " + myMinIntValue + 1);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum Value of Byte is : " + myMinByteValue);
        System.out.println("Maximum Value of Byte is : " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum Value of Short is : " + myMinShortValue);
        System.out.println("Maximum Value of Short is : " + myMaxShortValue);

        long myLongValue = 100L;
        
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Value of Long is : " + myMinLongValue);
        System.out.println("Maximum Value of Long is : " + myMaxLongValue);
    }

}
