import java.util.Scanner;

public class Prob3 {
  public static void main(String[] args){


Scanner scan  = new Scanner (System.in);
System.out.println("enter the number of students");
int students = scan.nextInt();

System.out.println("enter the name");
String student1 = scan.nextLine();

System.out.println("enter score");
double score1 = scan.nextDouble();

for (int i = 0; i < students - 1; i++){
  System.out.println("enter a student name");
  String student = scan.nextLine();
  System.out.println("eneter student score");
  double score = scan.nextDouble();
  if (score > score1) {
    student1 = student;
    score1 = score;
  }
}

System.out.println("top student is " + student1 + "'s score is" + score1);


  }
}