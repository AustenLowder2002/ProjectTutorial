package Test;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       float temperature;
       String letter = null;

       System.out.println("Please enter 1 for converting Fahrenheit, 2 for converting Celsius or 3 for Kelvin: ");
       float temp = input.nextFloat();
       if(temp == 1){
           System.out.println("Please enter your degrees in Fahrenheit: ");
           temperature = input.nextFloat();
           double fToC = (double)(temperature-32)*5/9;
           letter = String.valueOf(fToC);

       }else if(temp == 2){
           System.out.println("Please enter your degrees in Celcius: ");
           temperature = input.nextFloat();
           double cToF = (double)(9/5)* temperature + 32;
           letter = String.valueOf(cToF);
       }else if(temp ==3){
           System.out.println("Would you like to convert Fahrenheit or Celsius?");
           System.out.println("Enter 1 for Fahrenheit or 2 for Celsius:");
           int temps = input.nextInt();
           if(temps==1){
               System.out.println("Please enter your degrees in Fahrenheit: ");
               temperature = input.nextFloat();
               double fToC = (double)(temperature-32)*5/9 + 273.15;
               letter = String.valueOf(fToC);

           }else{
                System.out.println("Please enter your degrees in Celsius");
                temperature = input.nextFloat();
                double cToK = (double)temperature + 273.15;
                letter = String.valueOf(cToK);

           }
       }
        System.out.println("Temperature is " + letter);
    }
}
