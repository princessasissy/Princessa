import java.util.Scanner;
public class JavaLibs5026211061 {
    public static void main(String[]args){
        Scanner nasa = new Scanner(System.in);
        System.out.print("Where is your dream Country to go?");
        String dreamcountry = nasa.next();

        System.out.print("Who is your favorite person?");
        String favperson = nasa.next();

        System.out.print("Enter a name of transportation that fly in the air!");
        String transportation = nasa.next();

        System.out.print("How many days in a year?");
        int year = nasa.nextInt();

        System.out.print("What is 100.25 + 25?");
        double result = nasa.nextDouble();

        System.out.print("What is the capital city of your dream country?");
        String capitalcity = nasa.next();

        System.out.print("how many days in a month and a half?");
        int month = nasa.nextInt();

        System.out.print("Who is you favorite Group band?");
        String band = nasa.next();

        System.out.print("Choose a number between 1-9!");
        int number = nasa.nextInt();

        System.out.print("What is your mom and your dad birthday year in total?");
        int total = nasa.nextInt();

        System.out.print("What is your favorite subject?");
        String subject = nasa.next();

        double math = total + result;

        System.out.println("Giselle: Hi Tamara! Do you already have any plan for this semester holiday?");

        System.out.println("Tamara: Hi Giselle! yes i have, i will go to " +dreamcountry+ " with " +favperson);

        System.out.println("Giselle: wow that's cool! how will you get there?");

        System.out.println("Tamara: by " +transportation);

        System.out.println("Giselle: isnt it expensive? how  much is the ticket fror each person?");

        System.out.println("Tamara: its " +year+ " dollars! i need to save up to buy those ticket haha");

        System.out.println("Giselle: how about the hotel? have you already booked one?");

        System.out.println("Tamara: i will stay at a hotel named " +result+ " hotel in the center of " +capitalcity+ " for " +month+ " days");

        System.out.println("Giselle: the hotel name is very unique, i believe the owner like math very much! anyway what will you do there?");

        System.out.println("Tamara: I will go to " +band+ " concert! do you know them?");

        System.out.println("Giselle: yes i know! they have " +number+ " members and have yearly income nearly " +math+ " Dollars");

        System.out.println("Tamara: Yes you're right! How about you? any holidays plan?");

        System.out.println("Giselle: i just want to spend my holidays reading " +subject+ " books");

        nasa.close();

    }
}
