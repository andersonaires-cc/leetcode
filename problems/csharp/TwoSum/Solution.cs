using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace TwoSum
{
    public class Solution
    {
        public static int[] TwoSum(int[] nums, int target)
        {
            int Tam = nums.Length;
            int resul = 0;
            int[] vetor;


            for (int i = 0; i < Tam; i++)
            {
                for (int j = i + 1; j < Tam; j++)
                {
                    if (nums[i] + nums[j] == target)
                    {
                        return vetor = new int[2] { i, j };
                    }
                }
            }
            return Array.Empty<int>();
        }
    }
}