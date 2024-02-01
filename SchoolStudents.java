import java.util.Scanner;

public class SchoolStudents {
    public static void main(String[] args)
    {
        String userName;
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, please enter a name");
        userName = sc.nextLine();
        System.out.println("Welcome to school " + userName);
        sc.close();
        Scanner an = new Scanner(System.in);
        answer = an.nextInt();
        System.out.println(userName + " what is 8 + 2 ?");
        if(answer == 10) {
            System.out.println("that is correct");
        }
        else
            System.out.println("that is not correct");
        an.close();
    }
}
