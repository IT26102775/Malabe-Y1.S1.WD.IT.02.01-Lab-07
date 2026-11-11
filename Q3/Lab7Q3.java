import java.util.Scanner;
 public class Lab7Q3{
  public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  
  // Declaring constants
  final double DISCOUNT_RATE = 0.05;
  
  int customerno = 1;
  while (customerno <= 5)
  {
  // User inputs
  System.out.print("Enter the total bill amount :");
  double bill = input.nextDouble();
  System.out.print("Enter the mode of payment. (C for cash , O for others) :");
  char mode_of_payment = input.next().charAt(0);
  
  // Checking whether discounts are applicable
  if (mode_of_payment == 'O' || mode_of_payment == 'o'){
	  System.out.println("No discounts applicable");
	  System.out.println("Amount to be paid :" + bill);
      }
	  
  else if (mode_of_payment == 'C' || mode_of_payment == 'c'){
	  double discount = bill * DISCOUNT_RATE;
      double final_amount = bill - discount;
      System.out.println("Discount is :" + discount);
      System.out.println("Amount to be paid :" + final_amount);}
	  
  else {System.out.println("Payment mode is not valid");}
  System.out.println();
  customerno ++;
  }
  }
  }
 
 

  