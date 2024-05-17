import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        char grade =  'B';
        switch (grade) {
           case 'A' :
           System.out.println("The grade is " + grade);
           break; // break the switch statement
           case 'B' :
           System.out.println("The grade is " + grade);
           break;
           case 'C' :
           System.out.println("The grade is " + grade);
           break;
           default:
           System.out.println("No grade");
        }

        if (grade == 'A' || grade == 'B' || grade == 'C' ) {
            System.out.println("The grade is " + grade);
        } else {
            System.out.println("No grade");
        }
        // if you dont use break statement
        int x = 0;
        switch (grade) {
            case 'A' :
            x += 10;
            break; // break the switch statement
            case 'B' :
            x += 10;
            break;
            case 'C' :
            x += 10;
            break;
            default:
            x += 10;
    }
    System.out.println("x=" + x);


// Scanner
Scanner input = new Scanner(System.in);
System.out.print("Please input a number: ");
int month = input.nextInt();
System.out.println("month = " + month);
    }
}
