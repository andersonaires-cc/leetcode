namespace TwoSumApp
{
    public class Solution
    {
        public static int[] TwoSum(int[] nums, int target)
        {
            int tam = nums.Length;

            for (int i = 0; i < tam; i++)
            {
                for (int j = i + 1; j < tam; j++)
                {
                    if (nums[i] + nums[j] == target)
                    {
                        return new int[2] { i, j };
                    }
                }
            }

            return Array.Empty<int>();
        }
    }
}
