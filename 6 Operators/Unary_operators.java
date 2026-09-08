public class Unary_operators {
  public static void main(String[] args) {
    
    int x = 5;
    
    //converts positive value to negative value
    int y = -x;

    int z = -y;

    System.out.println(y);

    System.out.println(z);
    
    int p =10;

    System.out.println(p);

    //post increment - first print then add 
    System.out.println(p++);
    
    System.out.println(p);

    //pre increment - first add then print
    System.out.println(++p);

    int r = 20;

     System.out.println(r);

    //post decrement - first print then subtract 
    System.out.println(r--);
    
    System.out.println(r);

    //pre decrement - first sub then print
    System.out.println(--r);


  }
}
