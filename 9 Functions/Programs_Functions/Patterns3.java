package Programs_Functions;

import java.util.Scanner;

public class Patterns3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number :");
    int n = input.nextInt();
    pattern01(n);
    pattern02(n);
    //pattern03(n);
  }
  public static void pattern01(int n){
    int i,j;
    for(i=0;i<n;i++){
      for(j=0;j<=i;j++){
        System.out.print("*");
      }
        System.out.println();
    }
    System.out.println();
  }


  public static void pattern02(int n){
    int i,j;
    for(i=0;i<n;i++){
      for(j=1;j<n-i+1;j++){
        System.out.print("*");
      }
        System.out.println();
    }
    System.out.println();
  }
 

  // public static void pattern03(int n){
  //   int i,j;
  //   for(i=0;i<n;i++){
  //     for(j=0;j<=i;j++){
  //       System.out.print(" ");
  //     }
  //       System.out.println("*");
  //   }
  // }
}
