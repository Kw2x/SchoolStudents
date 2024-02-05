import java.util.Scanner; // importing Scanner Class

 class SchoolStudents {
    public static void main(String[] args)
    {
        // local variables
        String userName;
        int num1 = 4; // hard coded the int
        int num2 = 9; // hard coded the int
        int answer; // keep  this dynamic to check against

        Scanner un = new Scanner(System.in); // Scanner to hold userName
        Scanner an = new Scanner(System.in); // Scanner to hold the answer
        System.out.println("Hello, please enter a name");
        userName = un.nextLine();
        System.out.println("Welcome to school " + userName);


        // Question 1
        String question = ("what is " +  num1 + "+" + num2 + "?");
        System.out.println(question);
        answer = an.nextInt();
        System.out.println("The answer  is " + (num1 + num2)); // calculation
        System.out.println("You answered " + answer);// validation


        // Question 2
        question = ("what is " +  num1 + "-" + num2 + "?");
        System.out.println(question);
        answer = an.nextInt();
        System.out.println("The answer  is " + (num1 - num2));
        System.out.println("You answered " + answer);


        // Question 3
        question = ("what is " +  num1 + "*" + num2 + "?");
        System.out.println(question);
        answer = an.nextInt();
        System.out.println("The answer  is " + (num1 * num2));
        System.out.println("You answered " + answer);


        // Question 4
        question = ("what is " +  num1 + "/" + num2 + "?");
        System.out.println(question);
        answer = an.nextInt();
        System.out.println("The answer  is " + (num1 / num2));
        System.out.println("You answered " + answer);
        un.close();
    }
}
