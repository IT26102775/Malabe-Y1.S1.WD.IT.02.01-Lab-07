import java.util.Scanner;
public class Lab7Q1a{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  
   System.out.println("Enter marks for four subjects :");
   
   int subj = 1;
   int sum = 0;
   int count = 0;
   String grade = "";
   
	   while (subj <= 4){
		System.out.println("Enter subject Mark " + subj);
		int mark = input.nextInt();
		sum += mark; 
		count += 1;
		subj +=1;
	   }
		  double average = sum / count; 
		  System.out.println("Average is :" + average);
		  
		  if (average > 75){ 
		   grade = "Distinction";}
		  else if (average <= 74 && average >=50){
		  grade = "Credit";}
		  else { grade ="Fail";}
		 
		  System.out.println("Overall grade is :" + grade);
 }
}