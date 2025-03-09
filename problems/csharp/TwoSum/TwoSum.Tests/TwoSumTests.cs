using Xunit;
using TwoSum;

namespace TwoSum.Tests
{
    public class TwoSumTests
    {
        [Fact]
        public void Test_TwoSum_Success()
        {
            // Arrange
            int[] nums = { 2, 7, 11, 15 };
            int target = 9;

            // Act
            var result = Solution.TwoSum(nums, target);

            // Assert
            Assert.Equal(new int[] { 0, 1 }, result);
        }

        [Fact]
        public void Test_TwoSum_NoSolution()
        {
            // Arrange
            int[] nums = { 1, 2, 3 };
            int target = 7;

            // Act
            var result = Solution.TwoSum(nums, target);

            // Assert
            Assert.Empty(result); // Nenhuma solução encontrada
        }

        [Fact]
        public void Test_TwoSum_EmptyArray()
        {
            // Arrange
            int[] nums = { };
            int target = 5;

            // Act
            var result = Solution.TwoSum(nums, target);

            // Assert
            Assert.Empty(result); // Nenhuma solução encontrada
        }
    }
}
