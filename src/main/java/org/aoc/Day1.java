package org.aoc;

import java.util.List;

public final class Day1 {
    public Day1()
    {
        System.out.println("Day 1 selected. Part 1 solution:");
        System.out.println(part1());
        System.out.println("Part 2 solution:");
        System.out.println(part2() + System.lineSeparator());
    }

    /*
    --- Day 1: Not Quite Lisp ---

    Santa was hoping for a white Christmas, but his weather machine's "snow" function is powered by stars, and he's fresh
    out! To save Christmas, he needs you to collect fifty stars by December 25th.

    Collect stars by helping Santa solve puzzles. Two puzzles will be made available on each day in the Advent calendar;
    the second puzzle is unlocked when you complete the first. Each puzzle grants one star. Good luck!

    Here's an easy puzzle to warm you up.

    Santa is trying to deliver presents in a large apartment building, but he can't find the right floor - the directions
    he got are a little confusing. He starts on the ground floor (floor 0) and then follows the instructions one character
    at a time.

    An opening parenthesis, (, means he should go up one floor, and a closing parenthesis, ), means he should go down one
    floor.

    The apartment building is very tall, and the basement is very deep; he will never find the top or bottom floors.

    For example:

        (()) and ()() both result in floor 0.
        ((( and (()(()( both result in floor 3.
        ))((((( also results in floor 3.
        ()) and ))( both result in floor -1 (the first basement level).
        ))) and )())()) both result in floor -3.

    To what floor do the instructions take Santa?

    */
    public static int part1()
    {
        List<String> input = Utils.parseInputToString();
        String inputString = input.get(0);

        //Floor 0 is the first floor
        int floor = 0;

        String output = inputString.replaceAll("\\(\\)", "");

        for (int i = 0; i < output.length(); i++)
        {
            if (output.charAt(i) == '(')
            {
                floor++;
            }
            //We are guaranteed only ( or ) by problem constraint so no further char check
            else
            {
                floor--;
            }
        }

        return floor;
    }

    /*
    --- Part Two ---

    Now, given the same instructions, find the position of the first character that causes him to enter the
    basement (floor -1). The first character in the instructions has position 1, the second character has position 2,
    and so on.

    For example:

        ) causes him to enter the basement at character position 1.
        ()()) causes him to enter the basement at character position 5.

    What is the position of the character that causes Santa to first enter the basement?

     */
    public static int part2()
    {
        List<String> input = Utils.parseInputToString();
        int floor = 0;
        int firstBasementPosition = 0;
        String inputString = input.get(0);

        for (int i = 0; i < inputString.length(); i++)
        {
            //By checking floor before changing it, we ensure at least one increment of i occurs, thus correct position
            if (floor == -1)
            {
                firstBasementPosition = i;
                break;
            }
            else if (inputString.charAt(i) == '(')
            {
                floor++;
            }
            //Problem constraint allows for only ( and ) so we don't need another char check
            else
            {
                floor--;
            }
        }

        return firstBasementPosition;
    }
}
