import java.util.Scanner;
public class IT24100273Lab7Q1A{

      public static void main (String[] args){

             Scanner scanner = new Scanner (System.in);
              
             int mark1,mark2,mark3,mark4;
             double avg;

             System.out.println("Enter marks for four subjects : ");             	
             System.out.print("Enter subject mark 1 : ");
             mark1 = scanner.nextInt();

             System.out.print("Enter subject mark 2 : ");
             mark2 = scanner.nextInt();

             System.out.print("Enter subject mark 3 : ");
             mark3 = scanner.nextInt();

             System.out.print("Enter subject mark 4 : ");
             mark4 = scanner.nextInt();

             avg = (mark1+mark2+mark3+mark4)/4;
             System.out.println();

             System.out.println("Average is :" + avg);

             String result = (avg>0 && avg<50) ? "fail" : (avg>49 && avg<75) ? "credit" : (avg>74 && avg<101) ? "distiction" : "incorrect average.." ;
             System.out.println("Overall grade is  : " + result);  

      } 
}