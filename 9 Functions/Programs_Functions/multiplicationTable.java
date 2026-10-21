package Programs_Functions;
import java.util.Scanner;
public class multiplicationTable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  System.out.print("Enter the number");
  int num = input.nextInt();
  Multiplication(num);
  //Tables(num);

  }
  
  public static void Multiplication(int num){
    int i,multiply;
    for(i=0;i<=10;i++){
      multiply = num *i; 
      System.out.println(num +" X "+ i +" = " + multiply);
    }
  }
    
                        //or

    public static void Tables(int num){
      int i=0;
      while ((i<=10)) {
        System.out.println(num +" X "+ i + " = " +(num*i));
        i++;
      }

    }
  
  //input.close();

}
