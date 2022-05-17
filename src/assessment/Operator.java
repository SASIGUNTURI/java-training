package assessment;

public class Operator {
    public static void main(String[] args) {
        int a = 10, b = 20;
        String  Operator= "+";
        switch (Operator) {
            case "+":
            System.out.println("addition of two numbers is :"+(a+b));
            break;
            case "-":
            System.out.println("substraction of two numbers is :" +(a - b));
                break;
            case "/":
             System.out.println("division of two numbers is : " +(a / b));
                break;
                case "*":
            System.out.println("multiplication of two numbers is :"+(a * b));
                    break;
            default:
                System.out.println( "default numbers " );
        }
    }
}
