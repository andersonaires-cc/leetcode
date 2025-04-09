namespace TwoSumApp
{
    public class Solution
    {
        public static int[] TwoSum(int[] nums, int target)
        {
            var map = new Dictionary<int, int>();

            for (int i = 0; i < nums.Length; i++)
            {
                int complement = target - nums[i];
                if (map.ContainsKey(complement))
                    return new[] { map[complement], i };

                if (!map.ContainsKey(nums[i]))
                    map[nums[i]] = i;
            }

            return Array.Empty<int>();
        }
    }
}
