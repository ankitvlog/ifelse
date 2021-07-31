import java.util.Scanner;
public class Decisionmaking{
public static void main(String[] arge){
int input;
System.out.println("Enter the age: ");
Scanner s = New Scanner(System.in);
input = s.nextInt();
if(input>18)
System.out.println("You are eligible to vote.");
else if(input > 20)
System.out.println("You are a major.");
else
System.out.println("You are NOT a major.");
}
}
