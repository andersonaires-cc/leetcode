using Xunit;
using TwoSumApp;

namespace TwoSumApp.Tests
{
    public class TwoSumTests
    {
        [Fact]
        public void DeveRetornarIndicesCorretos()
        {
            int[] nums = { 2, 7, 11, 15 };
            int target = 9;

            var resultado = Solution.TwoSum(nums, target);

            Assert.Equal(new[] { 0, 1 }, resultado);
        }

        [Fact]
        public void DeveRetornarVazioQuandoNaoHaSolucao()
        {
            int[] nums = { 1, 2, 3 };
            int target = 10;

            var resultado = Solution.TwoSum(nums, target);

            Assert.Empty(resultado);
        }
    }
}
