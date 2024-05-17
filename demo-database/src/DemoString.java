public class DemoString {
    public static void main(String[] args) {
        // String stores text
        // double quote to declare a String value
        String x = "hello";
        String y = "$%@#$%$#";
        String dollar = "$10";

        String withSpace = "hell h ell";
        System.out.println(withSpace);

        // +
        String z = x + dollar;
        System.out.println(z);

        double price = 9.99;
        String item = "book";
        String description = " The " + item + " cost $" + price;
        System.out.println(description);

        char a = 'a';
        String message = "The answer is:" + a;
        System.out.println(message);

        // String Method (Tool) 1 : length()
        String t = "hello";
        System.out.println("The length of t=" + t.length());

        // check if length of t >= 4, if yes, print hello, else goodbye
        if (t.length() >= 4) {
            System.out.println("hello");
        } else {
            System.out.println("goodbye");
        }

        // Method 2: equals()
        String s1 = "hello";
        String s2 = "hello";
        if (s1. equals(s2)) {
            System.out.println("They are having the same String value"); // print
        } else {
            System.out.println("They are not with the same value");
        }

        if (!s1.equals(s2)) {
            System.out.println("They are not with the same value");
        } else {
            System.out.println("They are having same String value");
        }

        if (s1 == s2) {
            System.out.println("They are same object.");
        }

        // check if s1 length >= 6 or s1 eaquals s2, print ...

        if (s1.length() >= 6 || s1.equals(s2)); { // false || true -> true
            System.out.println("hello");
        }

        if (s1.length() >= 6) {
            System.out.println("hello world");
        } else if (s1.equals(s2)) {
            System.out.println("hello");
        }

        // And
        if (s1.length() >= 6 && s1.equals(s2)); { // false || true -> true
            System.out.println("hello");
        }

        // Method 3: chatAt(int index), for example, charAt(0)
        String s3 = "World";
        // 0 means the first index
        // 1 means the second index
        // 4 means the 5th character
        System.out.println("The 1st character of s3=" + s3.charAt(0)); // w
        System.out.println("The 5th character of s3=" + s3.charAt(4)); // d

        System.out.println("The last character of s3=" + s3.charAt(s3.length() - 1)); //d

        // exercise: check if the last character is d and the length >5, print yes.
        String x2 = "hello world";
        if (x2.charAt(x2.length() - 1) == 'd' && x2.length() > 5) {
         System.out.println("yes"); //
        } else {
        System.out.println("no");
    }

    //Method 4; substring(int beginIndex, int endIndex)
    String result = x2.substring(0, 2);
    System.out.println(result); // he

    System.out.println(x2.substring(0,5));
    System.out.println(x2.substring(3,8));
    System.out.println(x2.substring(0,0));
    System.out.println(x2.substring(0,1));

    // check if the first 3 character is "wel", if yes, print yes
    String x3 = "welcome";

    if (x3.substring(0,3).equals("wel")) {
        System.out.println("yes");

        System.out.println(x3.substring(0, 3).length());
        System.out.println(x3.substring(0, 3).charAt(1));

        String x4 = x3.substring(0, 3);
        int l1 = x4.length();
        System.out.println(l1);

        // charAt()
        if (x3.charAt(0) == 'w' && x3.charAt(1) == 'e' && x3.charAt(2) == 'l') {
            System.out.println("yes");
        }

    } 

    
 } 
}
