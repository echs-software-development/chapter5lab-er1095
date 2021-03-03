import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){
  Scanner scan  = new Scanner (System.in);
  System.out.println("enter the number of grades");
  int time = scan.nextInt();
  int sumOfGrades = 0;

  for (int i = 0; i <= time; i++){
    System.out.println("enter grade " + i + "-->");
    int grade = scan.nextInt();
    sumOfGrades += grade;
  }

System.out.println("the sum of the grades is: " + sumOfGrades);


 










  }
}