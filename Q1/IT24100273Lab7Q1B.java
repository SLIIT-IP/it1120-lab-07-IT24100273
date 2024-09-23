import java.util.Scanner;
public class IT24100273Lab7Q1B{

      public static void main (String[] args){

             Scanner scanner = new Scanner (System.in);
             int i = 1; 
             while(i<=3){
           
                 System.out.println("Student" + i);
                 System.out.print("Enter marks : ");
                 int m1 = scanner.nextInt();
                 int m2 = scanner.nextInt();
                 int m3 = scanner.nextInt();
                 int m4 = scanner.nextInt();

                 double avg = (m1+m2+m3+m4)/4;
 
                 System.out.println("Average is :" + avg);

                 String result = (avg>0 && avg<50) ? "fail" : (avg>49 && avg<75) ? "credit" : (avg>74 && avg<101) ? "distiction" : "incorrect average.." ;
                 System.out.println("Overall grade is  : " + result);  
                 i++;
             }
      } 
}