package the_basics;

public class DataTypes {
    public static void main(String[] args) {
        /*Primitive Data Types(Start with small letter)
        Integers(byte,short,ing,long)
        Floating-Pont(float,double)
        Character-char
        Boolean-boolean

        Non-primitive Data Types (Start with Capital letter)
        String
        Array
        List
        Set
        Stack
        Vector
        Dictionary
        All-user-defined classes
        etc...*/

        byte byteNumber = 12;//-128 to 127
        short shortNumber = 12345;//-32,768 to 32,767
        int intNumber = 12345678;//-2,147,483,648 to 2,147,483,647
        long longNumber = 1234567890123456789L;

        //8bit = 1 byte
        //2 power 0 to ...byte

        float floatNumber = 1.2345678f;//(32bit)
        double doubleNumberd = 1.23456789123456d;
        double doubleNumber = 1.2345678912345678;//(64bit)

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        boolean booleanValue = true;
        boolean booleanValue2 = false;

        System.out.println(booleanValue);
        System.out.println(booleanValue2);

        char character = 98;//ASCII TABLE
        char character2 = 'b';//Within single code
        System.out.println(character);


    }
}
