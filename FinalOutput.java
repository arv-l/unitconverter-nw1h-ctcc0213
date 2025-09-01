// Final Output / Layug, Arvin Rome V. / NW1H // gittttttt, sample branch
//Java Console Unit Converter// 
package com.layug.sanagumana; 
import java.util.Scanner;

public class FinalOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**Java Console Unit Converter**");
        System.out.println("(Type Numbers Only)");

        while (true) {//main screen loop
            System.out.println("Choose an option:\n1. Temperature\n2. Length\n3. Speed\n4. Weight\n");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            boolean another = true;//this line keeps the inner loop active unless the user choose to exit

            switch (choice) {//choose
                case 1://temperature//
                    while (another) {//loop statement
                        System.out.println("Choose temperature conversion:\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");
                        System.out.print("Enter your choice: ");
                        int temp = sc.nextInt();
//conversion
                        switch (temp) {
                            case 1://C to F
                                System.out.print("Enter temperature in Celsius: ");
                                double celsius = sc.nextDouble();
                                double fahrenheit = (celsius * 9 / 5) + 32;
                                System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
                                break;
                            case 2://F to C
                                System.out.print("Enter temperature in Fahrenheit: ");
                                double FAHRENHEIT = sc.nextDouble();
                                double CELSIUS = (FAHRENHEIT - 32) * 5 / 9;
                                System.out.printf("Temperature in Celsius: %.2f\n", CELSIUS);
                                break;
                            default:
                                System.out.println("Invalid, Try again.");
                                continue;
                        }
                        //loop trigger
                        System.out.println("Convert another temperature?\n1. Yes\n2. Main Menu\n3. Exit");
                        int temploop = sc.nextInt();

                        if (temploop == 3) {//exit
                            System.out.println("Exiting. Goodbye!");
                            System.exit(0);
                        } else if (temploop == 2) {//main menu
                            another = false;
                        } else if (temploop != 1) {//if not 1 or 3 its invalid
                            System.out.println("Invalid");
                            another = false;
                        }                            
                    }
                    break;

                case 2://length//
                    while (another) {//loop statement
                        System.out.println("Choose length conversion:\n1. Meters to Feet\n2. Feet to Meters");
                        System.out.print("Enter your choice: ");
                        int length = sc.nextInt();
//conversion
                        switch (length) {
                            case 1://m to ft.
                                System.out.print("Enter length in meters: ");
                                double meters = sc.nextDouble();
                                double feet = meters * 3.28084;
                                System.out.printf("Length in feet: %.2f\n", feet);
                                break;
                            case 2://ft. to m
                                System.out.print("Enter length in feet: ");
                                double FEET = sc.nextDouble();
                                double METERS = FEET / 3.28084;
                                System.out.printf("Length in meters: %.2f\n", METERS);
                                break;
                            default:
                                System.out.println("Invalid, Try again.");
                                continue;
                        }
                        //loop trigger
                        System.out.println("Convert another length?\n1. Yes\n2. Main Menu\n3. Exit");
                        int lengthloop = sc.nextInt();

                        if (lengthloop == 3) {//exit
                            System.out.println("Exiting. Goodbye!");
                            System.exit(0);
                        } else if (lengthloop == 2) {//main menu
                            another = false;
                        } else if (lengthloop != 1) {//if not 1 or 3 its invalid
                            System.out.println("Invalid");
                            another = false;
                        }
                    }
                    break;

                case 3://speed//
                    while (another) {//loop statement
                        System.out.println("Choose speed conversion:\n1. mph to kph\n2. kph to mph");
                        System.out.print("Enter your choice: ");
                        int speed = sc.nextInt();
//conversion
                        switch (speed) {
                            case 1://mph to kph
                                System.out.print("Enter speed in mph: ");
                                double mph = sc.nextDouble();
                                double kph = mph * 1.60934;
                                System.out.printf("Speed in kph: %.2f\n", kph);
                                break;
                            case 2://kph to mph
                                System.out.print("Enter speed in kph: ");
                                double KPH = sc.nextDouble();
                                double MPH = KPH / 1.60934;
                                System.out.printf("Speed in mph: %.2f\n", MPH);
                                break;
                            default:
                                System.out.println("Invalid, Try again.");
                                continue;
                        }
                        //loop trigger
                        System.out.println("Convert another speed?\n1. Yes\n2. Main Menu\n3. Exit");
                        int speedloop = sc.nextInt();

                        if (speedloop == 3) {//exit
                            System.out.println("Exiting. Goodbye!");
                            System.exit(0);
                        } else if (speedloop == 2) {//main menu
                            another = false;
                        } else if (speedloop != 1) {//if not 1 or 3 its invalid
                            System.out.println("Invalid");
                            another = false;
                        }
                    }
                    break;

                case 4://weight//
                    while (another) {//loop statement
                        System.out.println("Choose weight conversion:\n1. Kilograms to Pounds\n2. Pounds to Kilograms");
                        System.out.print("Enter your choice: ");
                        int weight = sc.nextInt();
//conversion
                        switch (weight) {
                            case 1://kg to lbs
                                System.out.print("Enter weight in kilograms: ");
                                double kilograms = sc.nextDouble();
                                double pounds = kilograms * 2.20462;
                                System.out.printf("Weight in pounds: %.2f\n", pounds);
                                break;
                            case 2://lbs to kg
                                System.out.print("Enter weight in pounds: ");
                                double lbs = sc.nextDouble();
                                double kgs = lbs / 2.20462;
                                System.out.printf("Weight in kilograms: %.2f\n", kgs);
                                break;
                            default:
                                System.out.println("Invalid, Try again.");
                                continue;
                        }
                        //loop trigger
                        System.out.println("Convert another weight?\n1. Yes\n2. Main Menu\n3. Exit");
                        int weightloop = sc.nextInt();                   

                        if (weightloop == 3) {//exit
                            System.out.println("Exiting. Goodbye!");
                            System.exit(0);
                        } else if (weightloop == 2) {//main menu
                            another = false;
                        } else if (weightloop != 1) {//if not 1 or 3 its invalid
                            System.out.println("Invalid");
                            another = false;
                        }                        
                    }
                    break;

                default://invalid choice
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }
        }
    }
}