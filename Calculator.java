import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = stdin.nextInt();
        stdin.nextLine(); // consume newline character
        System.out.print("Enter the operator <+ - / *>: ");
        String operator = stdin.next();
        char op = operator.charAt(0);
        System.out.print("Enter second number: ");
        int b = stdin.nextInt();

        int result;
        if (op == '+') {
            result = a + b;
            System.out.println("Answer: " + result);
        } else if (op == '-') {
            result = a - b;
            System.out.println("Answer: " + result);
        } else if (op == '/') {
            if(b==0)
            {
                System.out.println("ERROR: Division by zero");  
            }
            result = a / b;
            System.out.println("Answer: " + result);
        } else if (op == '*') {
            result = a * b;
            System.out.println("Answer: " + result);
        } else {
            System.out.println("Undefined operator");
        }
    }
}
