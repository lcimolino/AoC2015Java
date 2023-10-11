package org.aoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int choice = -1;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Advent of Code 2015 solution helper!" + System.lineSeparator());
        System.out.print("Type the day number to display or press 0 to exit: ");

        while (choice != 0)
        {
            choice = input.nextInt();

            if (choice == 1)
            {
                System.out.println("Day 1 selected. Part 1 solution:");
                System.out.println(Day1.part1FindFloorWithParentheses(parseInputToString()));
                System.out.println("Part 2 solution:");
                System.out.println(Day1.part2FindFirstBasementCharacter(parseInputToString()));
            }
        }
    }

    //Helper method allows us to parse the input.txt file programmatically instead of manually
    public static String parseInputToString()
    {
        File input = new File("input.txt");
        StringBuilder output = new StringBuilder();

        try
        {
            Scanner inputReader = new Scanner(input);

            while(inputReader.hasNextLine())
            {
                output.append(inputReader.nextLine());
            }

        } catch (FileNotFoundException e)
        {
            System.out.println("Error: file not found or inaccessible.");
        }

        return output.toString();
    }
}