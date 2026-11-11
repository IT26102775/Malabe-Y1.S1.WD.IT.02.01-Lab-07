import java.util.Scanner;
public class Lab7Q1b{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  
   
   int subj = 1;
   int sum = 0;
   int count = 0;
   String grade = "";
   int studentno = 1;
   while (studentno <= 3){ 
    System.out.println("student :" + studentno);
	System.out.print("Enter marks ");
	int mark1 = input.nextInt();
	int mark2 = input.nextInt();
	int mark3 = input.nextInt();
	int mark4 = input.nextInt();
	sum = mark1 + mark2 + mark3 + mark4; 
	count += 1;
	subj +=1;
	   
		  double average = sum / count; 
		  System.out.println("Average is :" + average);
		  
		  if (average > 75){ 
		   grade = "Distinction";}
		  else if (average <= 74 && average >=50){
		  grade = "Credit";}
		  else { grade ="Fail";}
		 
		  System.out.println("Overall grade is :" + grade);
          studentno++;}
	}
 }
