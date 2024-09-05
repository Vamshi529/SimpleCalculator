import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = input.nextInt();
        System.out.print("Enter the Second number : ");
        int b = input.nextInt();
        System.out.println("The Add of the two number is : "+(a+b));
        System.out.println("The Sub of the two number is : "+(a-b));
        System.out.println("The Product of the two number is : "+(a*b));
        System.out.println("The Div of the two number is : "+(a/b));
        input.close();
    }
}