using System;
using TwoSum;

class Program
{
    static void Main()
    {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        var result = TwoSum.Solution.TwoSum(nums, target);
        Console.WriteLine($"Resultado: [{string.Join(", ", result)}]");
    }

}