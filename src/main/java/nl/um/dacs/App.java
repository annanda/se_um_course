package nl.um.dacs;

import nl.um.dacs.lecture1.Day;

/**
 * Hello world!
 *
 */
public class App 
{   
    private static void date_violation(){
        System.out.println( "Violation of Day class logic!" );
        Day d = new Day(30, 4, 2025);
        System.out.println(d.date);
        d.date++;
        System.out.println(d.date);
    }
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        date_violation();

    }
}
