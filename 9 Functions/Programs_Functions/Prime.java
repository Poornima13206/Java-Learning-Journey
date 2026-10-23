package Programs_Functions;

import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
    boolean result = isPrime(num);
    
    if(result){
      System.out.println(num +" is a Prime Number");
    }
    else{
      System.out.println(num +" is not a Prime Number");
    }

    input.close();
  }

  public static boolean isPrime(int num){
    if(num<=1){
      return false;
    }

    for(int i=2;i<num;i++){
      if(num % i ==0){
        return false;
      }
    }
    return true;
  }
}
