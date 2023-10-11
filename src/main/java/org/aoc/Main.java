package org.aoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int choice = -1;
        Scanner input = new Scanner(System.in);
        File inputFile = new File("input.txt");

        System.out.println("Welcome to the Advent of Code 2015 solution helper!" + System.lineSeparator());
        System.out.print("Type the day number to display or press 0 to exit: ");

        while (choice != 0)
        {
            choice = input.nextInt();

            if (choice == 0)
            {
                System.out.println("Exiting program.");
            }
            if (choice == 1)
            {
                System.out.println("Day 1 selected. Part 1 solution:");
                System.out.println(Day1.part1FindFloorWithParentheses(parseInputToString(inputFile)));
                System.out.println("Part 2 solution:");
                System.out.println(Day1.part2FindFirstBasementCharacter(parseInputToString(inputFile)));
            }
        }
    }

    //Helper method allows us to parse the input.txt file programmatically instead of manually
    public static List<String> parseInputToString(File input)
    {
        List<String> output = new ArrayList<>();

        try
        {
            Scanner inputReader = new Scanner(input);

            while(inputReader.hasNextLine())
            {
                output.add(inputReader.nextLine());
            }

        } catch (FileNotFoundException e)
        {
            System.out.println("Error: file not found or inaccessible.");
        }

        return output;
    }
}