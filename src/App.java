import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      mySelf();
        double mortgage ;
        int principal ;
        double annualRate ;
        byte months = 12;
        int AmountOfPerPayment;

        System.out.println("******************************************\n");
        System.out.println("--------->>> MORTGAGE CALCULATOR <<<--------\n");
        System.out.println("******************************************\n");
        // Taking inputs 

        Scanner scan = new Scanner(System.in);
        System.out.print("Principal : ");
        principal = scan.nextInt();
        System.out.print("Annual Interest Rate : ");
        annualRate = scan.nextDouble();
        System.out.print("Number of Payment : ");
        AmountOfPerPayment = scan.nextInt();

        // Calculations 
        double ratePerMonth = (annualRate/100)/months;
        int numberOfPayment = (AmountOfPerPayment*months);

        double resultForPow = Math.pow((1+ratePerMonth), numberOfPayment);

        mortgage = principal * ((ratePerMonth*resultForPow)/((1+ratePerMonth)-1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String resultForCurrency = currency.format(mortgage);

        System.out.println(resultForCurrency);
       

      scan.close();
    }

    public static void mySelf (){
      String name = "Asanga Emmanuel ";
      byte age = 21;

      System.out.println("My name is "+name+" ,  I am "+age+ " years old");
    }
}
