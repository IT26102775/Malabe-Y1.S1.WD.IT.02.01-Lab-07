public class Lab7Q2b{
  public static void main(String[] args){
   
  int rows = 5;
  int cols = 5;
  
  for(int rowCount = 1; rowCount <= rows; rowCount++){
	   System.out.print(rowCount + "-" + " ");
      for(int colsCount = 1; colsCount <= rowCount; colsCount++)
	      {System.out.print("*");}
      System.out.print("\n"); }
}}