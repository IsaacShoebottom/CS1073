/**   @author Isaac Ray Shoebottom (3429069) **/
import java.util.Scanner;
public class InputAndOutput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("My name is TOM. What is your name?");
        String userName = sc.nextLine();
        System.out.println("Pleased to meet you, " + userName);
        System.out.println("In which program are you enrolled?");
        String userEnrollment = sc.nextLine();
        System.out.println("Oh? So you're " + userName + ", currently enrolled in " + userEnrollment + '!');
    }
}