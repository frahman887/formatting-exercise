package com.pluralsight;


public class FormattingExercise {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double gpa = 3.6789;

        // Step 1: Format and print the string variable (name)
        String namePrint= String.format("Name: %s", name); // make variable that does formatting for string
        System.out.println(namePrint);
        // Example output: Name: Alice

        // Step 2: Format and print the integer variable (age)
        String agePrint = String.format("Age: %d", age);
        System.out.println(agePrint);
        // Example output: Age: 25

        // Step 3: Format and print the double variable (gpa) with 2 decimal places
        String gpaPrint = String.format("GPA: %.2f", gpa);
        System.out.println(gpaPrint);
        // Example output: GPA: 3.68

        // Step 4: Combine all three into one formatted sentence using String.format
        String allPrint =  String.format("Name: %s, Age: %d, GPA: %.2f", name, age, gpa);
        System.out.println(allPrint);
        // Example output: Name: Alice, Age: 25, GPA: 3.68

        // Step 5: Print the same combined sentence using printf
        System.out.printf("Name: %s, Age: %d, GPA: %.2f \n", name, age, gpa);
        // Example output: Name: Alice, Age: 25, GPA: 3.68

    }
}