public class DemoPrimitives {
    public static void main(String[] args) {
        // number / string (text)
        // number (integers/ decimal)
        // int is a data type that declaring the type of value of x can be stored.
        // int -> integer
        int x = 3;
        // int y = 3.5; // y cannot store non-integer number.
        int z = -9;
        int total = x + z; // -6
        System.out.println(total);
        
        // + - * /
        int a = 4;
        int b = 7;
        int c = 9;
        int apple = a * c - b * a; // 8
        System.out.println(apple);

        // 
        int lazy = (c + b) / a; // 4
        System.out.println(lazy);

        // remainder

        int remainder = 10 % 3; //1
        int divide = 10 / 3; //3
        System.out.println(remainder);
        System.out.println(divide);

        //2024.5.10
        double m1 = 4.4;
        double m2 = 4.444;
        double m3 = -4.4444;

        double result2 = m1 + m2 - m3; // 4.4 + 4.444 - 4.4444
        System.out.println(result2); // double  = +,-,*,/

        double result3 = 0.1 + 0.2;
        System.out.println(result3);

        double result4 = 2 + 4 * 0.25 * 3 / 2 - 10;
        System.out.println(result4);

        int f1 = 7;
        double f2 = 8.8;

        // error, because int + double = double(7.0) + double(8.8) = double(15.8),
        // so, double value can be stored in an int varible
        // int f3 = f1 + f2; error

        int g = 10 / 3; // int / int = int =3, so, 3 can be assigned to variable g
        
        // Primitive : char
        char c1 = '!'; // single quote to declaree a char value
        char c2 = ' '; // space value
        // char c3 = ''; // error, char variable must contain a single character
        // char c4 = 'aa'; = error

        // Primitive: boolean
        // boolean b1 = "true"; // we cannot assign a string value to boolean
        boolean b2 = true;
        boolean b3 = false;
        // boolean b4 = 1;

        // Primitives for Integer
        // int, long, byte, short
        byte y1 = 1;
        // byte can only store the interger with range of the value between -128 and +127 (2^x)
        byte y2 = -128;
        byte y3 = 127;
        // byte y4 = 128; // compile error (java can identify the syntax error)

        short s1 = -32768; // -32768 to 32767
        int i1 = -2147483648; // -2147483648 to 2147483647
        // int i2 = -2147483649;

        long l1 = -922337429390808L; // -922337429390808 = int
        long l2 = 922337429390807L; // L means a way to specify this value is a long value
        // long l3 = 922337429390808L

        // Primitives for number with decimal place
        // 1. 10.2 = double value
        // 2. we cannot assign a double value to float variable because float is with lower level of data type
        // 3. Inconclude, you cannt assign a higher level of data value to a lower level data tyoe
        double d10 = 10.2;
        // 10.2f is a float value
        float f10 = 10.2f;

        // float f11 = 10.5f + 10.5; // float + double = double, unable to assign double to float

        double d11 = 99.99d; // same as double d12 = 99.99;

        // Local variable ( within the main program, you are able to declare the same variable once only)
        double d12; // variable declaration
        d12 = 10.9; // value declaration
        
        double d13 = 14.3; // declaration & assignment
        // double d13 = 19.0; // you cannot redeclare the same variable
        d13 = 19.0; // reassignment





    }
}