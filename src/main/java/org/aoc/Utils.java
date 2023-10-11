package org.aoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    //Helper method allows us to parse the input.txt file programmatically instead of manually
    public static List<String> parseInputToString()
    {
        File inputFile = new File("input.txt");

        List<String> output = new ArrayList<>();

        try
        {
            Scanner inputReader = new Scanner(inputFile);

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
