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
        } else {
            System.out.println(bmi + "Bmi not optimal");
        }
    }

    //    Write an application that takes a positive number from the user (type int) and writes all numbers from 1 to the given number, each on the next line, with the following changes:
//            ● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
//            ● in place of numbers divisible by 7, instead of a number the program should write "Buzz"
//            ● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"
//    ositive number from the user (type int) and prints all prime numbers greater than 1 and less than the given number.
    public static void fizzbuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numar");
        int numar = scanner.nextInt();
        for (int i = 1; i <= numar; i++) {
            if ((i % 3) == 0 && (i % 7) == 0) {
                System.out.println("fizz buzz" + i);
                continue;
            }
            if ((i % 7) == 0) {
                System.out.println("buzz" + i);
                continue;
            }
            if ((i % 3) == 0) {
                System.out.println("fizz" + i);
                continue;
            }
            System.out.println(i);
        }
    }

    //   Write an application that takes a positive number from the user (type int) and prints all prime numbers greater than 1 and less than the given number.
    public static void positivNumber() {
        System.out.println("Introduceti numar");
        int number = 10;
        for (int i = 2; i < number; i++) {
            int k = 0;
            for (int j = 1; j <= i / 2; j++) {
                if ((i % j) == 0) {
                    k++;
                    System.out.println("Numerele prime :");
                }
            }
            if (k <= 2) {
                System.out.println(i + " este numar prim");
            }
        }
    }
    //  Write an application that takes a positive number from the user (type int) and prints all prime numbers greater than 1 and less than the given number.

    public static void printAllPrimeNumbers() {
        System.out.println("Give me a numbers ");
        Scanner scanner = new Scanner(System.in);
        int newNumber = scanner.nextInt();
        if (newNumber <= 1) {
            System.out.println("The numbers is not greater than 1 ");
            return;
        }
        for (int i = 2; i < newNumber; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        System.out.println("a");
    }

    private static boolean isPrime(int nr) {
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                // System.out.println("rest =" + rest);
                return false;
            }
        }
        // System.out.println("End of for");
        return true;
    }

    private static boolean isPrime1(int nr) {
        boolean isPrimeNr = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                isPrimeNr = false;
                break;
            }
        }
        return isPrimeNr;
    }

    // Write an application that will read texts (variables of the String type) until the user gives the text "Enough!" and then writes the longest of the given texts (not including the text "Enough!"). If the user does not provide any text, write "No text provided".
    public static void longestWord() {
        System.out.println("Type your word");
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String longestWord1 = "";
        while (!word.equals("Enought")){

            if (!word.equals("Enought") && word.length() < longestWord1.length()) {
                longestWord1 = word;
            }
            word = scanner.next();
        }
        while (!word.equals("Enought"));
        if (longestWord1.length() == 0) {
            System.out.println("No text providers");
            return;
        }
        System.out.println("Longest word is " + longestWord1);
    }
   // Write an application that "stutters", that is, reads the user's text (type String), and prints the given text, in which each word is printed twice. For example, for the input: "This is my test" the application should print "This This is is my my test test

    public static void stutters(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your word: ");

        String text= scanner.nextLine();
        String[] words=text.split("");
        System.out.println("Stutter; ");
        for (int i = 0;i< words.length;i++){
            System.out.println(words[i] + " " +words[i] + " ");
        }
        System.out.println(words[words.length-1] + " " + words[words.length-1]);
    }
    public static void testObjects() {
        Dog dog1 = new Dog("Azorel");
//        dog1.setName("Azorel");

        Dog dog2 = new Dog("Azorel");
//        dog2.setName("Azorel");

        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.getName().equals(dog2.getName()));
    }
}





