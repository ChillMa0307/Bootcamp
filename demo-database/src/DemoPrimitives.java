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
    }
}