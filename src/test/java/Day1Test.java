import org.aoc.Day1;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Day1Test {

    @Test
    public void part1_empty_input_should_return_0()
    {
        //Act - pass in an empty string, store output
        int result = Day1.part1FindFloorWithParentheses(List.of());

        //Assert - check if 0 is returned
        Assert.assertEquals(0, result);
    }

    @Test
    public void part1_balanced_parentheses_should_return_0()
    {
        //Act - pass in a string with balanced parentheses, store output
        int result = Day1.part1FindFloorWithParentheses(List.of("()()()()()()()()()()()()()()()()()()()()"));

        //Assert - check if 0 is returned
        Assert.assertEquals(0, result);
    }

    @Test
    public void part1_left_biased_parentheses_should_return_correct_positive()
    {
        //Act - pass in a string with more left parentheses than right, store output
        int result = Day1.part1FindFloorWithParentheses(List.of("(()()()()())(()()()()()()()((()()()())()()()()"));

        //Assert - check if 2 is returned
        Assert.assertEquals(2, result);
    }

    @Test
    public void part1_right_biased_parentheses_should_return_correct_negative()
    {
        //Act - pass in a string with more left parentheses than right, store output
        int result = Day1.part1FindFloorWithParentheses(List.of("()))))()()()()())(()()())()()(()(())()()()))()"));

        //Assert - check if -6 is returned
        Assert.assertEquals(-6, result);
    }

    @Test
    public void part2_empty_input_should_return_0()
    {
        //Act - pass in an empty string, store output
        int result = Day1.part2FindFirstBasementCharacter(List.of());

        //Assert - check if 0 is returned
        Assert.assertEquals(0, result);
    }

    @Test
    public void part2_balanced_parentheses_should_return_0()
    {
        //Act - pass in a string with balanced parentheses, store output
        int result = Day1.part2FindFirstBasementCharacter(List.of("()()()()()()()()()()()()()()()()()()()()"));

        //Assert - check if 0 is returned
        Assert.assertEquals(0, result);
    }

    @Test
    public void part2_positive_input_should_return_0()
    {
        //Act - pass in a string with more left parentheses than right, store output
        int result = Day1.part2FindFirstBasementCharacter(List.of("(()()()()())(()()()()()()()((()()())()()()()"));

        //Assert - check if 0 is returned
        Assert.assertEquals(0, result);
    }

    @Test
    public void part2_negative_input_should_return_correct_value()
    {
        //Act - pass in a string with more left parentheses than right, store output
        int result = Day1.part2FindFirstBasementCharacter(List.of("()))))()()()()())(()()())()()((()()()())()))()"));

        //Assert - check if -6 is returned
        Assert.assertEquals(3, result);
    }
}
