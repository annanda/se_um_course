package nl.um.dacs.lecture1;

public class Day {
    // atributes are public and can directly be changed by clients
    // which can break the class logic
    public int year;
    public int month;
    public int date;

    public Day(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year; 
    }
}
