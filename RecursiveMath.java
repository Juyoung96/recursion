// RecursiveMath.java

public class RecursiveMath {
  
  public static void main( String[] args ) {
    
    System.out.println( factorial(31) );
    //fibonacci(10);
    
  } // END main method
  
  public static long factorial( int n ) {
    if( n > 1 ) {
      n *= factorial( n-1 ); // 10! = 10*9! = 10*9*8! ... 1!
    }
    return n;
  }
  
} // END RecursiveMath