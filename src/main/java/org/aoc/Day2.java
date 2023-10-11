package org.aoc;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class Day2 {
    public Day2()
    {
        System.out.println("Day 2 selected. Part 1 solution:");
        System.out.println(part1());
        System.out.println("Part 2 solution:");
        System.out.println(part2() + System.lineSeparator());
    }

    /*
    --- Day 2: I Was Told There Would Be No Math ---

    The elves are running low on wrapping paper, and so they need to submit an order for more. They have a list of the
    dimensions (length l, width w, and height h) of each present, and only want to order exactly as much as they need.

    Fortunately, every present is a box (a perfect right rectangular prism), which makes calculating the required
    wrapping paper for each gift a little easier: find the surface area of the box, which is 2*l*w + 2*w*h + 2*h*l.
    The elves also need a little extra paper for each present: the area of the smallest side.

    For example:

        A present with dimensions 2x3x4 requires 2*6 + 2*12 + 2*8 = 52 square feet of wrapping paper plus 6 square feet
        of slack, for a total of 58 square feet.
        A present with dimensions 1x1x10 requires 2*1 + 2*10 + 2*10 = 42 square feet of wrapping paper plus 1 square
        foot of slack, for a total of 43 square feet.

    All numbers in the elves' list are in feet. How many total square feet of wrapping paper should they order?
     */

    public static int part1()
    {
        List<String> input = Utils.parseInputToString();

        int totalSquareFeet = 0;

        for (String inputLine: input)
        {
            totalSquareFeet += part1FindSquareFeetOfPresent(inputLine);
        }

        return totalSquareFeet;
    }

    //Helper method to de-clutter part1
    private static int part1FindSquareFeetOfPresent(String present)
    {
        if (present.isEmpty())
        {
            return 0;
        }
        //Creates an array for given present in the form: length, width, height
        int result = 0;
        String[] dimensions = present.split("x");
        int[] dimensionsInt = Arrays.stream(dimensions)
                .mapToInt(Integer::parseInt)
                .toArray();

        //Allows us to easily sort and drop largest
        List<Integer> dimensionList = new ArrayList<>();
        for (int item: dimensionsInt)
        {
            dimensionList.add(item);
        }
        dimensionList.sort(Comparator.naturalOrder());
        dimensionList.remove(2);

        //Surface area of box is 2*l*w + 2*w*h + 2*h*l.
        result += 2 * dimensionsInt[0] * dimensionsInt[1];
        result += 2 * dimensionsInt[1] * dimensionsInt[2];
        result += 2 * dimensionsInt[2] * dimensionsInt[0];

        //The elves need extra paper equal to the area of the smallest side
        result += dimensionList.get(0) * dimensionList.get(1);

        return result;
    }

    /*
    --- Part Two ---

    The elves are also running low on ribbon. Ribbon is all the same width, so they only have to worry about the length
    they need to order, which they would again like to be exact.
    The ribbon required to wrap a present is the shortest distance around its sides, or the smallest perimeter of any
    one face. Each present also requires a bow made out of ribbon as well; the feet of ribbon required for the perfect
    bow is equal to the cubic feet of volume of the present. Don't ask how they tie the bow, though; they'll never tell.

    For example:

        A present with dimensions 2x3x4 requires 2+2+3+3 = 10 feet of ribbon to wrap the present plus 2*3*4 = 24 feet
        of ribbon for the bow, for a total of 34 feet.
        A present with dimensions 1x1x10 requires 1+1+1+1 = 4 feet of ribbon to wrap the present plus 1*1*10 = 10 feet
        of ribbon for the bow, for a total of 14 feet.

    How many total feet of ribbon should they order?
     */

    public static int part2()
    {
        List<String> input = Utils.parseInputToString();

        int totalRibbon = 0;

        for (String inputLine: input)
        {
            totalRibbon += part2FindRibbonNeededForPresent(inputLine);
        }

        return totalRibbon;
    }

    private static int part2FindRibbonNeededForPresent(String input)
    {
        int result = 0;

        return result;
    }
}
