package org.aoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int choice = -1;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Advent of Code 2015 solution helper!" + System.lineSeparator());

        while (choice != 0)
        {
            System.out.print("Type the day number to display or press 0 to exit: ");

            choice = input.nextInt();

            if (choice == 0)
            {
                System.out.println("Exiting program.");
            }
            else if (choice == 1)
            {
                Day1 day1 = new Day1();
            }
            else if (choice == 2)
            {
                Day2 day2 = new Day2();
            }
        }
    }


}