package sda04; // ZADANIE 24
//import java.util.Date;
import java.util.Scanner;

public class Main {                

    public static void main(String[] args) {
        
        Scanner scanDate = new Scanner(System.in);
        
        System.out.println("Podaj dzień.");
        int day = scanDate.nextInt();
        System.out.println("Podaj miesiąc.");
        int mounth = scanDate.nextInt();  
        System.out.println("Podaj rok.");
        int year = scanDate.nextInt();
        
        System.out.println("Dzień: " + day);
        System.out.println("Miesiąc: " + mounth);
        System.out.println("Rok: " + year);
        
        System.out.println("Kompletna data");
        
        System.out.println(day+"/"+mounth+"/"+year+"/");
        
        Date date = new Date();
         
    }
}

class Date
{
    int day;
    int mounth;
    int year;

    public int getDay() {
        return day;
    }

    public int getMounth() {
        return mounth;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void day()
    {
        System.out.println(day);
    }
    
    public void mounth()
    {
        System.out.println(mounth);
    }
    
    public void year()
    {
        System.out.println(year);
    }

}

