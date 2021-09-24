package fall.meissa;

import java.text.Format;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     double a= 5;
     double b=8;
        Addition addition = new Addition();
        double result =addition.add(a, b);
        System.out.println(String.format("Sum of %s and %s is %s", a , b , result));

    }
}
