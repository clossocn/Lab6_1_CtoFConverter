package com.example.lab6_1_ctofconverter;
import java.util.Scanner;

public class Lab6_1_CtoFConverter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double celsius, fahrenheit;

            while (true) {
                System.out.print("Enter a temperature in Celsius: ");

                if (scanner.hasNextDouble()) {
                    celsius = scanner.nextDouble();
                    fahrenheit = celsiusToFahrenheit(celsius);

                    if (isValidTemperature(celsius)) {
                        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
                        break;
                    } else {
                        System.out.println("Please enter a valid temperature value.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            }

            scanner.close();
        }

        public static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9/5) + 32;
        }

        public static boolean isValidTemperature(double celsius) {
            return celsius >= -273.15;
        }

}
