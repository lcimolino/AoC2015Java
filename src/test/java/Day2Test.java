import org.aoc.Day2;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Day2Test {

    @Test
    public void part1_empty_input_should_return_0()
    {
        //Act - pass in empty input, store result
        int result = Day2.part1FindTotalSquareFeet(List.of(""));

        //Assert - test if 0 is returned
        Assert.assertEquals(0, result);
    }

    @Test
    public void part1_area_should_calculate_as_expected()
    {
        //Act - pass in a simple input, store result
        int result = Day2.part1FindTotalSquareFeet(List.of(
                "14x29x15",
                "22x26x1",
                "14x17x9",
                "2x6x23",
                "29x7x5",
                "14x16x19",
                "14x21x18",
                "10x15x23",
                "21x29x14",
                "20x29x30",
                "23x11x5"));

        //Assert - test if expected 19944 is returned
        Assert.assertEquals(19944, result);
    }
}
