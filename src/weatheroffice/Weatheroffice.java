/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weatheroffice;

/**
 *
 * @author User
 */
public class Weatheroffice {
    public static void main(String[] args) {
                // Define the variables with temperature values
        double temperature1 = 35.5;
        double temperature2 = 30.5;
        double temperature3 = 22.2;
        double temperature4 = 16.1;
        double temperature5 = 7.3;
        double temperature6 = -1.0;

        // Call the conversion and weather statement functions for each temperature
        printWeather(temperature1);
        printWeather(temperature2);
        printWeather(temperature3);
        printWeather(temperature4);
        printWeather(temperature5);
        printWeather(temperature6);
    }

    // Function to convert Celsius to Fahrenheit and print the weather statement
    public static void printWeather(double temperatureCelsius) {
        int temperatureFahrenheit = convertToFahrenheit(temperatureCelsius);
        String weatherStatement = determineWeatherStatement(temperatureFahrenheit);

        System.out.println("Celsius: " + temperatureCelsius + "°C");
        System.out.println("Fahrenheit: " + temperatureFahrenheit + "°F");
        System.out.println("Weather Statement: " + weatherStatement);
        System.out.println();
    }

    // Function to convert Celsius to Fahrenheit
    public static int convertToFahrenheit(double temperatureCelsius) {
        double temperatureFahrenheit = temperatureCelsius * 9 / 5 + 32;
        return (int) Math.round(temperatureFahrenheit);
    }

    // Function to determine the weather statement based on Fahrenheit temperature
    public static String determineWeatherStatement(int temperatureFahrenheit) {
        if (temperatureFahrenheit >= 95) {
            return "A heat advisory has been issued.";
        } else if (temperatureFahrenheit >= 85 && temperatureFahrenheit <= 94) {
            return "Pleasant but warm.";
        } else if (temperatureFahrenheit >= 70 && temperatureFahrenheit <= 84) {
            return "Very pleasant weather today.";
        } else if (temperatureFahrenheit >= 50 && temperatureFahrenheit <= 69) {
            return "Pleasant but cool.";
        } else if (temperatureFahrenheit >= 33 && temperatureFahrenheit <= 49) {
            return "Cold weather.";
        } else {
            return "A freeze warning has been issued.";
        }
    }

    }
    

