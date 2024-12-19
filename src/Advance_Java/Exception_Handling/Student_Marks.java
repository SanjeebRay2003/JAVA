package Advance_Java.Exception_Handling;

import java.util.Scanner;

    class RangeException extends Exception {
        public RangeException(String message) {
            super(message);
        }
    }

public class Student_Marks {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Number of Subjects : ");
            int n = input.nextInt();
            int[] marks = new int[n];
            int total = 0;

            try {
                for (int i = 0; i <n; i++) {
                    System.out.print("Enter marks for subject " + (i+1) + ": ");
                    marks[i] = input.nextInt();


                    if (marks[i] < 0 || marks[i] > 100) {
                        throw new RangeException("Marks for subject " + (i+1) + " must be between 0 and 100.");
                    }

                    total += marks[i];
                }

                System.out.println("Total marks : "+total);

                double average = total / n;
                System.out.println("Average marks: " + average);


            } catch (RangeException e) {

                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {

                System.out.println("Invalid input. Please enter numeric values for marks.");
            }
        }
    }



