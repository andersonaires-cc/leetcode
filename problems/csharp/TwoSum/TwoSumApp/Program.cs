using TwoSumApp;

class Program
{
    static void Main()
    {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        var result = Solution.TwoSum(nums, target);
        Console.WriteLine($"Resultado: [{string.Join(", ", result)}]");
    }
}
