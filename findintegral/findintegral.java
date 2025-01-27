package findintegral;

public class findintegral {
    /**
  * finds the integral of the input
  * @author Victoria
  * @param coefficient and exponent of the input
  * @return the integral
  */
  public static String integrate(int coefficient, int exponent) {
  //gets new exponent
    int newexp = (exponent + 1);
 //gets leading number of integral
  int integral = (coefficient)/(newexp);
  
    return integral + "x^" + newexp;
}
}
