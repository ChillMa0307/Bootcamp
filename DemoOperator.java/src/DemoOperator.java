public class DemoOperator {
    public static void main(String[] args) {
        int x = 3;
        x = x + 1;
        System.out.println("x=" + x); // string + int  = string

        x++; // same as x = x + 1;
        System.out.println("x=" + x);

        x += 1; // same as x = x + 1;
        System.out.println("x=" + x);

        x += 2; // same as x = x + 2;
        System.out.println("x=" + x);

        ++x; // same as x = x + 1;
        System.out.println("x=" + x);

        int y = 4;
        y = y - 1;

        y--;
        --y;
        y -= 1;
        System.out.println("y=" + y);


        // *=, /=
        int p = 4;
        p = p * 2; // 8
        p *= 2; // 16
        p /= 4; // 
        System.out.println("p=" + p); // 4

        int z = 10;
        z = z % 3; //1
        int j = 10;
        j %= 3; // 1
        System.out.println("z=" + z + ", j=" + j); // z=1, j=1

        String s = "hello";
        s = s + "world";
        s += "!!!";
        System.out.println("s=" + s);

        // No ** //

        // >, <, >=, <= 
        boolean r1 = 10 > 3; // true
        boolean r2 = 4 > 10; // false
        boolean r3 = 10 >= 10; // true
        boolean r4 = -9 <= 9; // true

        // and (&&), or (||)
        boolean r5 = 10 > 3 && 20 >= 20; // true AND true = true, asking if 10 > 3, and if 20 >= 20
        boolean r6 = 10 > 3 && 4 < 4; // true AND false

        boolean r7 = 10 > 3 || 20 >=20; // true or true = true
        boolean r8 = 10 > 3 || 20 < 18; // true or false = true
        boolean r9 = 3 > 10 || 20 < 18; // false or false = false

        char c10 = 'A';
        char c11 = 'B';
        boolean r10 = c10 == c11; // false,  ask if a value is equals to another value, we use "=="
        boolean r11 = 'C' != '0'; // true, ask if a value is NOT equals to another value, we use "!="

        boolean r12 = 10 / 2 > 5 * 3; // false

        int n = 3;
        int result = n++ * 3; // original n times 3 first, assign 9 to result, then n - n + 1
        System.out.println(result);
        System.out.println(n); // 3 + 1 = 4

        int m = 4;
        int result2 = ++m * 5;
        System.out.println(result2); // (4 + 1) * 5
        System.out.println(m); // 4 + 1 = 5

        int k = 4;
        int result3 = k++ * 7 * ++k; // (4 * 7) * (5 + 1) 
        System.out.println(result3);
        System.out.println(k);



        


    }
    
}
