public class Demoif {
    public static void main(String[] args) { // code block
        // Conditional: if
        int x =3;
        if (x >= 3) { // true, code block
            System.out.println("x >= 3");

        }
        int y = 2;
        if (y >= 3) {
            System.out.println(" >= 3");
        } else {
            System.out.println("y < 3");
        }

        int a = 10;
        int b = 7;
        if (a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        
        // print max = 10

        int t = 3;
        int o = (t++ + 3)* t++ ;
        System.out.println(o);

    }
    
}
