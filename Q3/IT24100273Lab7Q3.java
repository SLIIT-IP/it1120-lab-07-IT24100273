import java.util.Scanner;
public class IT24100273Lab7Q3{
         public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
           
            
            double tamount,dis,bamount = 0;
            
            for(int i = 0 ; i<5 ; i++){
                 System.out.println("costomer"+(i+1));

                 System.out.print("Enter total bill amount : ");
                 bamount = scanner.nextInt();

                 System.out.print("Enter the mode of payment (c for cash , o for other) ");
                 char mode = scanner.next().charAt(0);

                 dis = bamount*5/100;

                 switch(mode){
                  
                    case 'c' :  System.out.println("discount is : " + dis);
                                     tamount = bamount - dis;
                                     System.out.println("Amount to be paid : " + tamount);
                                     break;

                    case 'o' :   System.out.println("no discount acomplicable ");
                                     System.out.println("Amount to be paid : " + bamount);
                                     break;

                    case 'C' :  System.out.println("discount is : " + dis);
                                     tamount = bamount - dis;
                                     System.out.println("Amount to be paid : " + tamount);
                                     break;

                    case 'O' :  System.out.println("no discount acomplicable ");
                                     System.out.println("Amount to be paid : " + bamount);
                                     break;

                    default :     System.out.print("Payment mode is not valid ");
                                     System.out.println();
                                     break;
                    }

                   System.out.println();                                      
           }
  }
}