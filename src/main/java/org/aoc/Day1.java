package org.aoc;

public class Day1 {
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
    public static int part1FindFloorWithParentheses(String input)
    {

        //Floor 0 is the first floor
        int floor = 0;

        String output = input.replaceAll("\\(\\)", "");

        for (int i = 0; i < output.length(); i++)
        {
            if (output.charAt(i) == '(')
            {
                floor++;
            }
            else
            {
                floor--;
            }
        }

        return floor;
    }

    public static int part2FindFirstBasementCharacter(String input)
    {
        int floor = 0;
        int firstBasementPosition = 0;

        for (int i = 0; i < input.length(); i++)
        {
            if (floor == -1)
            {
                firstBasementPosition = i + 1;
                break;
            }
            else if (input.charAt(i) == '(')
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
