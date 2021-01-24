package Fundamentals;

import java.util.Scanner;

public class TasksExercises {
    public static final float pi = (float) Math.PI;
    int x = 10;
    static int y = 1;

    // Write an application that will read diameter of a circle (variable of type float) and
    //calculate perimeter of given circle.
    //Firstly, assume π = 3.14. Later, use value of π from built-in Math class.
    public static void circlePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert diameter: ");
        float diameter = scanner.nextFloat();
        System.out.println("The perimeter has the folowing length: " + diameter * pi);
    }


    //write
    public static void bodyMassIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your height in cm");
        int height = scanner.nextInt();
        System.out.println("Insert your weight in kg");
        float weight = scanner.nextFloat();
        float bmi = weight / ((float) height * (float) height / 10000);
        if ((bmi > 18.5f) && (bmi <= 24.9)) {
            System.out.println(bmi + "Bmi  optimal");
        }else{
            System.out.println(bmi + "Bmi not optimal");
        }
    }
}





