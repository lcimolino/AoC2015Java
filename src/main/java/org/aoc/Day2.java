package org.aoc;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day2 {
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

    public static int part1FindTotalSquareFeet(List<String> input)
    {
        int totalSquareFeet = 0;

        for (String inputLine: input)
        {
            totalSquareFeet += part1FindSquareFeetOfPresent(inputLine);
        }

        return totalSquareFeet;
    }

    public static int part1FindSquareFeetOfPresent(String present)
    {
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
}
