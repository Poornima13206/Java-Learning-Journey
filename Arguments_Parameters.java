public class Arguments_Parameters {
  public static void main(String[] args) {
    int sum = addNumbers(15,5); //arguments are the values passed to the method when it is called
    System.out.println("The sum is: " + sum);
      System.out.println();
    //you can call the method or function more than once with different arguments
    System.out.println("The sum is: " + addNumbers(20,10)); //you can also call the method directly in the print statement
    System.out.println(" ");
    System.out.println("The sum is: " + addNumbers(30,20)); 
  }

  public static int addNumbers(int first, int second) { //parameters
    System.out.println("First number: " + first);
    System.out.println("Second number: " + second);
    return first + second; // Return the sum of a and b
  }
}
