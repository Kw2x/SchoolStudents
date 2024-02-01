import java.util.Scanner;

public class SchoolStudents {
    public static void main(String[] args)
    {
        String userName;
        //int answer;
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        System.out.println("Hello, please enter a name");
        userName = sc.nextLine();
        System.out.println("Welcome to school " + userName);
        System.out.println("First number: ");
        int num1 = num.nextInt();
        System.out.println("Second number: ");
        int num2 = num.nextInt();
        int answer = num1 + num2;
        System.out.println("The answer to " + num1 + " + " + num2 + " is " + answer);
        sc.close();
        num.close();

    }
}
