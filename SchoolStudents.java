import java.util.Random;
import java.util.Scanner; // importing Scanner Class
import java.util.concurrent.Flow;

public class SchoolStudents {
     public static void main(String[] args) {

         // local variables
         String userName;
         int score = 0;

         // Random numbers
         Random random = new Random();
         int num1; // dynamic to take randoms
         int num2; // dynamic to take randoms
         num1 = random.nextInt(10) + 1;
         num2 = random.nextInt(10) + 1;


         //Hello Message and getting User Input
         Scanner un = new Scanner(System.in); // Scanner to hold userName
         Scanner an = new Scanner(System.in); // Scanner to hold the answer
         System.out.println("Hello, please enter a name");
         userName = un.nextLine();
         System.out.println("Welcome to school " + userName);

         // Question 1
         printQuestion(num1, "+", num2);
         int userAnswer = an.nextInt();
         int correctAnswer = num1 + num2;
         answerVerification(userAnswer, correctAnswer);

         if (userAnswer == correctAnswer){
             score = score + 1;
             System.out.println("Your score is " + score);
         }
         else {
             System.out.println("Your score is " + (score));
         }
             System.out.println(userAnswer == correctAnswer);

         // Question 2
         printQuestion(num1, "-", num2);
         userAnswer = an.nextInt();
         correctAnswer = num1 - num2;

         if (userAnswer == correctAnswer){
             score = score + 1;
             System.out.println("Your score is " + score);
         }
         else {
             System.out.println("Your score is " + (score));
         }

         answerVerification(userAnswer, correctAnswer);

         // Question 3
         printQuestion(num1, "*", num2);
         userAnswer = an.nextInt();
         correctAnswer = num1 * num2;

         if (userAnswer == correctAnswer){
             score = score + 1;
             System.out.println("Your score is " + score);
         }
         else {
             System.out.println("Your score is " + (score));
         }

         answerVerification(userAnswer, correctAnswer);

         // Question 4
         printQuestion(num1, "/", num2);
         userAnswer = an.nextInt();
         correctAnswer = num1 / num2;
         if (userAnswer == correctAnswer){
             score = score + 1;
             System.out.println("Your score is " + score);
         }
         else {
             System.out.println("Your score is " + (score));
         }
         answerVerification(userAnswer, correctAnswer);
         printScore(userName, score);
         un.close();
     }

     public static void printQuestion(int num1, String op, int num2) {
         String question = "What is " + num1 + op + num2 + "?";
         System.out.println(question);
     }
     public static void answerVerification(int userAnswer, int correctAnswer) {
         System.out.println("The answer  is " + correctAnswer);
         System.out.println("You answered " + userAnswer);
     }
     public static void printScore(String username, int score){
         System.out.println("Thanks for playing " + username + " your score is " + score + " out of 5");
     }
  }
